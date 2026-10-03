package com.example.BookMyShowBe.service;

import com.example.BookMyShowBe.dto.BookingResponse;
import com.example.BookMyShowBe.dto.CreateBookingRequest;
import com.example.BookMyShowBe.entity.Booking;
import com.example.BookMyShowBe.entity.BookingStatus;
import com.example.BookMyShowBe.entity.Show;
import com.example.BookMyShowBe.entity.ShowSeat;
import com.example.BookMyShowBe.repository.BookingRepository;
import com.example.BookMyShowBe.repository.CustomerRepository;
import com.example.BookMyShowBe.repository.ShowRepository;
import com.example.BookMyShowBe.repository.ShowSeatRepository;
import jakarta.transaction.Transactional;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Locale;

@Service
public class BookingService {

    private final ShowRepository showRepository;


    private  final ShowSeatRepository showSeatRepository;

    private final BookingRepository bookingRepository;


    private  final CustomerRepository customerRepository;

    public BookingService(ShowRepository showRepository, ShowSeatRepository showSeatRepository, BookingRepository bookingRepository, CustomerRepository customerRepository) {
        this.showRepository = showRepository;
        this.showSeatRepository = showSeatRepository;
        this.bookingRepository = bookingRepository;
        this.customerRepository = customerRepository;
    }


    @Transactional
    public BookingResponse book(Long showId, CreateBookingRequest request)
    {
        Show show =showRepository.findById(showId).orElseThrow(()-> new ResourceNotFoundException("Show Not Found"));

        var customer = customerRepository.findById(request.profileId())
                .orElseThrow(()-> new ResourceNotFoundException("Profile Not Found"));


        //labels == j1 j2 j5 ye sb user send krehga
        List<String> labels=request.seatLabels().stream()
                .map(label->label.trim().toUpperCase(Locale.ROOT)).toList();

        if(labels.stream().distinct().count()!= labels.size())
        {
            throw new SeatUnavailableException("Duplicate seat labels are not allowed");

        }

        List<ShowSeat> seats=showSeatRepository.findForUpdate(showId,labels);

        if (seats.size() != labels.size() || seats.stream().anyMatch(ShowSeat::isReserved))
        {
           throw  new SeatUnavailableException("One or more selected seats are unvalibale");
            
        }

        seats.forEach(ShowSeat:: reserved);
        show.reserve(labels.size());
        BigDecimal total=show.getTicketprice().multiply(BigDecimal.valueOf(labels.size()));

        Booking booking=bookingRepository.save(new Booking(show,customer,total,labels));

        return BookingResponse.from(booking);
    }

    @Transactional
    public BookingResponse find(Long bookingId)
    {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new ResourceNotFoundException("Booking Not found"));

        return BookingResponse.from(booking);
    }


    @Transactional
    public List<BookingResponse> findByProfileId(Long profileId)
    {
        if (!customerRepository.existsById(profileId)) {
            throw new ResourceNotFoundException("Profile not found");
        }
        List<BookingResponse> list = bookingRepository.findByCustomerOrderByBookedAtDesc(profileId).stream()
                .map(BookingResponse::from).toList();

        return list;
    }

    @Transactional
    public BookingResponse cancel(Long bookingId,Long profileId)
    {
       Booking booking= bookingRepository.findByIdAndCustomerId(bookingId,profileId)
                .orElseThrow(()-> new ResourceNotFoundException("Booking not Found"));


        if (booking.getStatus()== BookingStatus.CONFIRMED) {

            List<ShowSeat> seats = showSeatRepository.findForUpdate(booking.getShow().getId(), booking.getSeatlabels());
             seats.forEach(ShowSeat:: release);
             booking.getShow().release(booking.getSeatlabels().size());
             booking.cancel();


        }
        return BookingResponse.from(booking);

    }
}

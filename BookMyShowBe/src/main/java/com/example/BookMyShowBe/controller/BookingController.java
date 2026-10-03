package com.example.BookMyShowBe.controller;


import com.example.BookMyShowBe.dto.BookingResponse;
import com.example.BookMyShowBe.dto.CreateBookingRequest;
import com.example.BookMyShowBe.repository.BookingRepository;
import com.example.BookMyShowBe.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bookings")
public class BookingController {

    private final BookingService bookingService;


    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/shows/{showId}")
    @ResponseStatus(HttpStatus.CREATED)
    public BookingResponse book(@PathVariable Long showId, @RequestBody CreateBookingRequest request)
    {
       return bookingService.book(showId,request);
    }

    @PostMapping("/{booking}/cancel")
    public BookingResponse book(@PathVariable Long bookingId, @RequestBody Long profileId)
    {
        return bookingService.cancel(bookingId,profileId);
    }

    @GetMapping("/{bookingId}")
    public BookingResponse find(@PathVariable Long bookingId)
    {
         return bookingService.find(bookingId);
    }







}

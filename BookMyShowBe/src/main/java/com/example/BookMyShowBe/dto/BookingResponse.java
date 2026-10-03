package com.example.BookMyShowBe.dto;

import com.example.BookMyShowBe.entity.Booking;
import com.example.BookMyShowBe.entity.BookingStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import  java.util.List;

public record BookingResponse(Long id, Long ShowId, Long profileId,
                              String movieTitle,
                              String theatreName,
                              String customerName,
                              String customerEmail,
                              String customerPhone,
                              List<String> seatLabels,
                              BigDecimal totalAmount,
                              BookingStatus status,
                              LocalDateTime bookedsAt)
{
    public static BookingResponse from( Booking booking)
    {
        return new BookingResponse(booking.getId(),booking.getShow().getId(),
                booking.getCustomer()==null ? null: booking.getCustomer().getId(),
                booking.getShow().getMovie().getTitle(),
                booking.getShow().getTheatre().getName(),
                booking.getCustomerName(),booking.getCustomerEmail(),
                booking.getCustomerPhone(),booking.getSeatlabels(),booking.getTotalAmount(),booking.getStatus(),
                booking.getBookedAt());

    }


}

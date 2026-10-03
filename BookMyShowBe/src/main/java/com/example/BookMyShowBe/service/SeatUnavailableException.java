package com.example.BookMyShowBe.service;

public class SeatUnavailableException extends  RuntimeException{


    public SeatUnavailableException(String msg)
    {
        super(msg);
    }
}

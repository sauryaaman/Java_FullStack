package com.example.BookMyShowBe.service;

public class ResourceNotFoundException extends  RuntimeException{


    public ResourceNotFoundException(String msg)
    {
        super(msg);
    }
}

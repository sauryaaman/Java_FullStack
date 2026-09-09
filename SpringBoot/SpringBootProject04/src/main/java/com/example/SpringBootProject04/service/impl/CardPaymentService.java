package com.example.SpringBootProject04.service.impl;

import com.example.SpringBootProject04.service.PaymentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CardPaymentService implements PaymentService {

    public String pay()
    {
        return "CARD";
    }


}

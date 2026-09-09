package com.example.SpringBootProject04.controller;

import com.example.SpringBootProject04.service.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentService paymentService;


    //ambiguityy prpblem paymenre serive has two  beans which one is get   this is one of the problem soluton by

    //1st solution
//    public PaymentController(@Qualifier("upiPaymentService") PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }


    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @GetMapping("/pay")
    public String pay()
    {
    return paymentService.pay();
    }
}

package com.example.SpringBootProject04.service.impl;

import com.example.SpringBootProject04.service.PaymentService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
 //priotiy  increase kri hia to jb en class ko do implementation ho to
public class UpiPaymentService implements PaymentService {


     public String pay()
     {
         return "UPI";
     }

}

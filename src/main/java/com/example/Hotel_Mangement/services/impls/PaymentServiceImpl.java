package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.entities.PaymentEnity;
import com.example.Hotel_Mangement.repositories.PaymentRepository;
import com.example.Hotel_Mangement.services.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl extends CommonServiceImpl<PaymentEnity, Long, PaymentRepository> implements PaymentService {
    public PaymentServiceImpl(PaymentRepository repo) {
        super(repo);
    }
}

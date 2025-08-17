package com.example.Hotel_Mangement.repositories;

import com.example.Hotel_Mangement.entities.PaymentEnity;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CommonRepository<PaymentEnity, Long> {
}

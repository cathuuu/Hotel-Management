package com.example.Hotel_Mangement.entities;

import com.example.Hotel_Mangement.enums.PaymentEnum;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "Payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PaymentEnity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "booking_id", nullable = false)
    Long bookingId;
    @Column(name = "payment_date", nullable = false)
    LocalDate paymentDate;
    @Column(name = "amount", nullable = false)
    float amount;
    @Column(name = "payment_method", nullable = false)
    PaymentEnum paymentMethod;
}

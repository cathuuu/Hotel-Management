package com.example.Hotel_Mangement.entities;

import com.example.Hotel_Mangement.enums.StatusBookingEnum;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "Customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "customer_id", nullable = false)
    Long customerId;
    @Column(name = "room_id",nullable = false)
    Long roomId;
    @Column(name = "employee_id", nullable = false)
    Long employeeId;
    @Column(name = "check_in", nullable = false)
    LocalDate checkIn;
    @Column(name = "check_out", nullable = false)
    LocalDate checkOut;
    @Column(name = "status", nullable = false)
    StatusBookingEnum status;
    @Column(name = "created_at",nullable = false)
    LocalDateTime createdAt = LocalDateTime.now();
}

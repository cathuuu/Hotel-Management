package com.example.Hotel_Mangement.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "ServiceUsages")
@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ServiceUsageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "booking_id", nullable = false)
    Long bookingId;
    @Column(name = "service_id", nullable = false)
    Long serviceId;
    @Column(name = "quantity", nullable = false)
    Integer quantity;
    @Column(name = "usage_date", nullable = false)
    LocalDate usageDate;
}

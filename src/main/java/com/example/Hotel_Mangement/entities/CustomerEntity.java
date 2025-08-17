package com.example.Hotel_Mangement.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity
@Table(name = "Customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "full_name", nullable = false)
    String fullName;
    @Column(name = "phone", nullable = false)
    String phone;
    @Column(name = "email", nullable = false)
    String email;
    @Column(name = "id_card", nullable = false)
    Long idCard;
    @Column(name = "address", nullable = false)
    String address;
    @Column(name = "created_at", nullable = false)
    LocalDate createdAt = LocalDate.now();
}

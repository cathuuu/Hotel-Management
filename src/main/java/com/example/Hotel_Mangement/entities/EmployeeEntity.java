package com.example.Hotel_Mangement.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "Employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "full_name", nullable = false)
    String fullName;
    @Column(name = "phone", nullable = false)
    String phone;
    @Column(name = "position", nullable = false)
    String position;
    @Column(name = "hire_date")
    LocalDate hireDate = LocalDate.now();
}

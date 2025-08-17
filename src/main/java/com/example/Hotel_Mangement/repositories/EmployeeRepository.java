package com.example.Hotel_Mangement.repositories;

import com.example.Hotel_Mangement.entities.EmployeeEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CommonRepository<EmployeeEntity, Long> {
}

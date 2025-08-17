package com.example.Hotel_Mangement.repositories;

import com.example.Hotel_Mangement.entities.CustomerEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CommonRepository<CustomerEntity, Long> {
}

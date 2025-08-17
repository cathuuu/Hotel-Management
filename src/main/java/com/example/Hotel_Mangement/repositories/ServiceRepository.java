package com.example.Hotel_Mangement.repositories;

import com.example.Hotel_Mangement.entities.ServiceEnity;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends CommonRepository<ServiceEnity, Long> {
}

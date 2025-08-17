package com.example.Hotel_Mangement.repositories;

import com.example.Hotel_Mangement.entities.BookingEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CommonRepository<BookingEntity, Long> {
}

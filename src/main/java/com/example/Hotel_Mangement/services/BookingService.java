package com.example.Hotel_Mangement.services;

import com.example.Hotel_Mangement.entities.BookingEntity;

import java.util.List;

public interface BookingService extends CommonService<BookingEntity, Long> {
    List<BookingEntity> findAllBookings();
    BookingEntity findBookingById(Long id);
    BookingEntity SaveBooking(BookingEntity bookingEntity);
    BookingEntity updateBooking(BookingEntity bookingEntity);
    void deleteBooking(BookingEntity bookingEntity);
}

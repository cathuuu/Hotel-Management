package com.example.Hotel_Mangement.services.impls;

import com.example.Hotel_Mangement.entities.BookingEntity;
import com.example.Hotel_Mangement.repositories.BookingRepository;
import com.example.Hotel_Mangement.services.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookingServiceImpl extends CommonServiceImpl<BookingEntity, Long , BookingRepository> implements BookingService {
    public BookingServiceImpl(BookingRepository repo) {
        super(repo);
    }

    @Override
    public List<BookingEntity> findAllBookings() {
        return repo.findAll();
    }

    @Override
    public BookingEntity findBookingById(Long id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public BookingEntity SaveBooking(BookingEntity bookingEntity) {
        return repo.save(bookingEntity);
    }

    @Override
    public BookingEntity updateBooking(BookingEntity bookingEntity) {
        return repo.save(bookingEntity);
    }

    @Override
    public void deleteBooking(BookingEntity bookingEntity) {
        repo.delete(bookingEntity);
    }
}

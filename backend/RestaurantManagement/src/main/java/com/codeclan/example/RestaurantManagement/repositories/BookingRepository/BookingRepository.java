package com.codeclan.example.RestaurantManagement.repositories.BookingRepository;

import com.codeclan.example.RestaurantManagement.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking,Long> {
    List<Booking> findByDateTime(LocalDateTime Date);
    List<Booking> findByDateTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
}

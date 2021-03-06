package com.codeclan.example.RestaurantManagement.repositories.RestaurantTableRepository;

import com.codeclan.example.RestaurantManagement.models.RestaurantTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface RestaurantTableRepository extends JpaRepository<RestaurantTable,Long> {
    List<RestaurantTable> findAllRestaurantTablesForBookingByDateTimeBetween(LocalDateTime startDate, LocalDateTime endDate);
}

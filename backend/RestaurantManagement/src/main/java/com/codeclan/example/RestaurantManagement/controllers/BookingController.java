package com.codeclan.example.RestaurantManagement.controllers;

import com.codeclan.example.RestaurantManagement.models.Booking;
import com.codeclan.example.RestaurantManagement.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "date/{date}")
    public List<Booking> getBookingsAtDate(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @PathVariable LocalDateTime date){
        return bookingRepository.findByDateTime(date);
    }

    @GetMapping(value = "datebetween/{startDate}/{endDate}")
    public List<Booking> getBookingsInRange(@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @PathVariable LocalDateTime startDate,@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @PathVariable LocalDateTime endDate){
        return bookingRepository.findByDateTimeBetween(startDate,endDate);
    }

}

package com.casestudy.BookingService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.BookingService.models.Booking;

public interface BookingRepository extends MongoRepository<Booking, String> {

}

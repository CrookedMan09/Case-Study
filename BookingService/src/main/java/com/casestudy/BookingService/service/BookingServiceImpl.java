package com.casestudy.BookingService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.BookingService.models.Booking;
import com.casestudy.BookingService.repository.BookingRepository;

@Service
public class BookingServiceImpl {

	@Autowired
	private BookingRepository bookingRepository;

	public void add(Booking booking) {
		this.bookingRepository.save(booking);
	}

	public List<Booking> getAllBookings() {
		return bookingRepository.findAll();
	}

}

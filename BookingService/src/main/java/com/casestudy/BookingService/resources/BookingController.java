package com.casestudy.BookingService.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.BookingService.models.Booking;
import com.casestudy.BookingService.service.BookingServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class BookingController {

	@Autowired
	private BookingServiceImpl bookingService;

	@PostMapping(value = "/add")
	@ApiOperation(value = "Add a new booking", notes = "Provide booking details to add a new booking")
	public void addnew(@RequestBody Booking booking, BindingResult result) {
		bookingService.add(booking);
	}

	@GetMapping(value = "/getallbookings")
	@ApiOperation(value = "Find all bookings", notes = "Fetches all the bookings in the system")
	public ResponseEntity<?> getAllBookings() {
		try {
			List<Booking> booking = bookingService.getAllBookings();
			return new ResponseEntity<>(booking, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}
}

package com.casestudy.RegistrationService.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.RegistrationService.models.Registration;
import com.casestudy.RegistrationService.service.RegistrationServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class RegistrationController {

	@Autowired
	private RegistrationServiceImpl registrationService;

	@GetMapping(value = "/getallregistrations")
	@ApiOperation(value = "Find all registrations", notes = "Fetches all the registrations in the system")
	public ResponseEntity<?> getAllRegistrations() {
		try {
			List<Registration> registration = registrationService.getAllRegistrations();
			return new ResponseEntity<>(registration, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/registration/{email}")
	@ApiOperation(value = "Find registration by email", notes = "Provide an email id to look up specific registartion")
	public Optional<Registration> findByRegistrationEmail(@PathVariable String email) {
		return registrationService.getRegistrationByEmail(email);
	}

	@PostMapping(value = "/add")
	@ApiOperation(value = "Add a new user", notes = "Provide userdetails to add a new user")
	public void addnew(@RequestBody Registration registration, BindingResult result) {
		registrationService.add(registration);
	}
}

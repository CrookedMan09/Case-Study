package com.casestudy.RegistrationService.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.RegistrationService.models.Registration;
import com.casestudy.RegistrationService.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl {

	@Autowired
	private RegistrationRepository registrationRepository;

	public List<Registration> getAllRegistrations() {
		return registrationRepository.findAll();
	}

	public Optional<Registration> getRegistrationByEmail(String email) {
		return registrationRepository.findOneByEmail(email);
	}

	public void add(Registration registration) {
		this.registrationRepository.save(registration);
	}

}

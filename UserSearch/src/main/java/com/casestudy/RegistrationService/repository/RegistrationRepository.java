package com.casestudy.RegistrationService.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.RegistrationService.models.Registration;

public interface RegistrationRepository extends MongoRepository<Registration, String> {

	Optional<Registration> findOneByEmail(String email);

}

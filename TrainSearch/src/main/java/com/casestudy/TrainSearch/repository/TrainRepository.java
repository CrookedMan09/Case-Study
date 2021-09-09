package com.casestudy.TrainSearch.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.TrainSearch.models.Trains;

public interface TrainRepository extends MongoRepository<Trains, String> {

	Trains findTrainByTrainNumber(String TrainNumber);

	Trains findTrainByTrainName(String TrainName);

//	Trains deleteTrainByTrainNumber(String TrainNumber);
}

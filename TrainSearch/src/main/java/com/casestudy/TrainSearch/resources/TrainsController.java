package com.casestudy.TrainSearch.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.TrainSearch.models.Trains;
import com.casestudy.TrainSearch.service.TrainServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class TrainsController {

	@Autowired
	private TrainServiceImpl trainService;

//	@GetMapping(value = "/getall")
//	public List<Trains> findtrains() {
//		return trainService.getAllTrains();
//	}
	@GetMapping(value = "/getalltrains")
	@ApiOperation(value = "Find all trains", notes = "Fetches all the trains in the system")
	public ResponseEntity<?> findAllTrains() {
		try {
			List<Trains> train = trainService.getAllTrains();
			return new ResponseEntity<>(train, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/gettrainbytrainnumber/{trainnumber}")
	@ApiOperation(value = "Find train by train number", notes = "Provide an train number to look up specific train")
	public ResponseEntity<?> getTrainByTrainNumber(@PathVariable("trainnumber") String trainnumber) {
		try {
			Trains train = trainService.findTrainByTrainNumber(trainnumber);
			return new ResponseEntity<>(train, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping(value = "/gettrainbytrainname/{trainname}")
	@ApiOperation(value = "Find train by train name", notes = "Provide an train name to look up specific train")
	public ResponseEntity<?> getTrainByTrainName(@PathVariable("trainname") String trainname) {
		try {
			Trains train = trainService.findTrainByTrainName(trainname);
			return new ResponseEntity<>(train, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

}

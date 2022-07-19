package com.passenger.data.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.passenger.data.entities.Passenger;
import com.passenger.data.service.PassengerService;


@RestController
@RequestMapping("/api")
public class PassengerController {

	@Autowired
	PassengerService passengerService; 
	
	@GetMapping("/passengers")
	ResponseEntity<List<Passenger>> get(){
		try {
			List<Passenger> list = (List<Passenger>) passengerService.get();
			
			if (list.isEmpty() || list.size() == 0) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			
			return new ResponseEntity<>(list, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/passengers/{id}")
	public ResponseEntity<Passenger> getPassenger(@PathVariable Integer id) {
		Optional<Passenger> passenger = passengerService.get(id);
		
		if (passenger.isPresent()) {
			return new ResponseEntity<Passenger>(passenger.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Passenger>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/passengers")
	public ResponseEntity<Passenger> savePasssenger(@RequestBody Passenger passenger) {
		try {
			return new ResponseEntity<Passenger>(passengerService.add(passenger), HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Passenger>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/passengers")
	public ResponseEntity<Passenger> updateCustomer(@RequestBody Passenger passenger) {
		try {
			return new ResponseEntity<Passenger>(passengerService.add(passenger), HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Passenger>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/passengers/{id}")
	public ResponseEntity<HttpStatus> deletePassenger(@PathVariable Integer id) {
		try {
			passengerService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}

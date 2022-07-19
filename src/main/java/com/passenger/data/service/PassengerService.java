package com.passenger.data.service;

import java.util.List;
import java.util.Optional;

import com.passenger.data.entities.Passenger;

public interface PassengerService {

	Passenger add(Passenger passenger);
	List get();
	Optional get(Integer id);
	
	void delete(Integer id);
}

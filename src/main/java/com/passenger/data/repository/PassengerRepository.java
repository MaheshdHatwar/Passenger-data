package com.passenger.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.passenger.data.entities.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer>{

	
}

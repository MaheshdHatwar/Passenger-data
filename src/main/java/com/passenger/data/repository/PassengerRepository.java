package com.passenger.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.passenger.data.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

	
}

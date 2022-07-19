package com.passenger.data.repository;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.passenger.data.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

	
}

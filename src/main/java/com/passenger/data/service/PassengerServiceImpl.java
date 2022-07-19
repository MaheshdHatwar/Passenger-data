package com.passenger.data.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

//import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.passenger.data.entities.Passenger;
import com.passenger.data.repository.PassengerRepository;

@Service
public class PassengerServiceImpl implements PassengerService {
	
	@Autowired
	private PassengerRepository passengerRepository;

	
	
	

	@Override
	public List get() {

		return (List) passengerRepository.findAll();
	}



	@Override
	public Passenger add(Passenger passenger) {
		return passengerRepository.save(passenger);
	}



	@Override
	public Optional get(Integer id) {
		// TODO Auto-generated method stub
		return passengerRepository.findById(id);

	}



	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
	
		if (get(id).isPresent()) {
			passengerRepository.delete((Passenger) get(id).get());
		}
	}



	
	
}



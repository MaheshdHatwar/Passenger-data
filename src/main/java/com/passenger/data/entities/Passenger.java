package com.passenger.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passenger {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String from_to;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom_to() {
		return from_to;
	}
	public void setFrom_to(String from_to) {
		this.from_to = from_to;
	}
	@Override
	public String toString() {
		return "Passenger [id=" + id + ", name=" + name + ", from_to=" + from_to + "]";
	}
	public Passenger(int id, String name, String from_to) {
		super();
		this.id = id;
		this.name = name;
		this.from_to = from_to;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}

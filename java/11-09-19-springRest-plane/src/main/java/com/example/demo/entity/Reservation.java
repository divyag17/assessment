package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@OneToOne
    private Flight flight;
	
	@OneToOne
    private Passenger passenger;


	
	public Long getId() {
		return id;
	}
	
	public Reservation(Flight flight, Passenger passenger) {
	super();
	this.flight = flight;
	this.passenger = passenger;
}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Reservation(Long id) {
		super();
		this.id = id;
	}
	public Reservation() {
		super();
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
    
}

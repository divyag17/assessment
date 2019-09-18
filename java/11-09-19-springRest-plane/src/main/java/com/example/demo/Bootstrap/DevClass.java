package com.example.demo.Bootstrap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Flight;
import com.example.demo.entity.Passenger;
import com.example.demo.entity.Reservation;
import com.example.demo.repository.FlightRepository;
import com.example.demo.repository.PassengerRepository;
import com.example.demo.repository.ReservationRepository;


@Component
public class DevClass implements ApplicationListener<ContextRefreshedEvent> {
	
	@Autowired
	public DevClass(FlightRepository flightRepository, ReservationRepository reservationRepository,
			PassengerRepository passengerRepository) {
		super();
		this.flightRepository = flightRepository;
		this.reservationRepository = reservationRepository;
		this.passengerRepository = passengerRepository;
	}
	private FlightRepository flightRepository;
	private ReservationRepository reservationRepository;
	private PassengerRepository passengerRepository;
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		Flight f=new Flight("jet","chennai","delhi");
		Passenger p=new Passenger("rani","19");
		
		
		f.getPassengers().add(p);
		p.getFlights().add(f);
		
		Reservation reservation = new Reservation(f,p);
		flightRepository.save(f);
		passengerRepository.save(p);
		reservationRepository.save(reservation);
		
		Flight f1=new Flight("deccan","lucknow","banglore");
		Passenger p1=new Passenger("divya","21");
		Reservation reservation1 = new Reservation(f1,p1);
		
		
		f.getPassengers().add(p1);
		p1.getFlights().add(f1);
		flightRepository.save(f1);
		passengerRepository.save(p1);
		reservationRepository.save(reservation1);
		
	}
	
}

package com.example.demo.entity;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Passenger {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String age;
    
 

	@ManyToMany
    @JoinTable(name = "reservation_passenger", joinColumns = @JoinColumn(name = "passenger_id"),
			    inverseJoinColumns = @JoinColumn(name = "flight_id"))
    private Set<Flight> flights  = new HashSet<>();


	public Set<Flight> getFlights() {
		return flights;
	}


	public void setFlights(Set<Flight> flights) {
		this.flights = flights;
	}


	public Passenger(String name, String age, Set<Flight> flights) {
		super();
		this.name = name;
		this.age = age;
		this.flights = flights;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	

	public Passenger(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Passenger() {
		super();
	}
}
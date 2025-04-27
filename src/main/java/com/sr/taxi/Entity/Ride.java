package com.sr.taxi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ride")
public class Ride {
	@Id
	private int id;
	private char pickUp;
	private char drop;
	private int pickUpTime;
	private float fare;
	@ManyToOne
	private Customer customer;
	@ManyToOne
	private Driver driver;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getPickUp() {
		return pickUp;
	}
	public void setPickUp(char pickUp) {
		this.pickUp = pickUp;
	}
	public char getDrop() {
		return drop;
	}
	public void setDrop(char drop) {
		this.drop = drop;
	}
	public int getPickUpTime() {
		return pickUpTime;
	}
	public void setPickUpTime(int pickUpTime) {
		this.pickUpTime = pickUpTime;
	}
	public float getFare() {
		return fare;
	}
	public void setFare(float fare) {
		this.fare = fare;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public Ride(int id, char pickUp, char drop, int pickUpTime, float fare, Customer customer, Driver driver) {
		super();
		this.id = id;
		this.pickUp = pickUp;
		this.drop = drop;
		this.pickUpTime = pickUpTime;
		this.fare = fare;
		this.customer = customer;
		this.driver = driver;
	}
	public Ride() {
		super();
	}
	
}
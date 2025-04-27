package com.sr.taxi.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="driver")
public class Driver {

	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	//@Column(name="name")
	private String name;
	
	//@Column(name="password")
	private String password;
	
	//@Column(name="age")
	private int age;
	
	//@Column(name="gender")
	private char gender;
	
	@Column(name="free_time")
	private int freetTime;
	
	@Column(name="current_spot")
	private char currentSpot;
	
	@Column(name="total_earnings")
	
	private float totalEarnings;
	
	@OneToMany(mappedBy="driver")
	private List<Ride> rides;

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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Driver(int id, String name, String password, int age, char gender) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
	}

	public Driver() {
		super();
	}

	public int getFreetTime() {
		return freetTime;
	}

	public void setFreetTime(int freetTime) {
		this.freetTime = freetTime;
	}

	public char getCurrentSpot() {
		return currentSpot;
	}

	public void setCurrentSpot(char currentSpot) {
		this.currentSpot = currentSpot;
	}

	public float getTotalEarnings() {
		return totalEarnings;
	}

	public void setTotalEarnings(float totalEarnings) {
		this.totalEarnings = totalEarnings;
	}

	public List<Ride> getRides() {
		return rides;
	}

	public void setRides(List<Ride> rides) {
		this.rides = rides;
	}

	
	
}

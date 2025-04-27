package com.sr.taxi.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	//@Column(name="name")
	private String name;
	
	//@Column(name="password")
	private String password;
	
	//@Column(name="gender")
	private char gender;
	
	//@Column(name="age")
	private int age;
	
	//@Column(name="email")
	private String email;

	@OneToMany(mappedBy = "customer")
	private List<Ride> rides;
	
	public Customer(int id, String name, String password, char gender, int age, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.gender = gender;
		this.age = age;
		this.email = email;
	}

	public Customer() {
		super();
	}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}

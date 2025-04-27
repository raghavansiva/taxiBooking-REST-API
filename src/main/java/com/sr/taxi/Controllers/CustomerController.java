package com.sr.taxi.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sr.taxi.Entity.Customer;
import com.sr.taxi.Repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerRepository repo;
	
	@PostMapping("/register")
	public Customer register(@RequestBody Customer c) {
		return repo.save(c);
	}
	
	@PostMapping("/login")
	public Customer login(@RequestParam String name, @RequestParam String password) {
		return repo.findByNameAndPassword(name, password);
	}
}

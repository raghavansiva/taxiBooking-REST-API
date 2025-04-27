package com.sr.taxi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.taxi.Entity.Driver;
import com.sr.taxi.Repository.DriverRepository;

@RestController
@RequestMapping("/driver")
public class DriverController {
	@Autowired
	private DriverRepository repo;
	
	@GetMapping("/summary")
	public List<Driver> getSummary() {
		return repo.findAll();
	}
}

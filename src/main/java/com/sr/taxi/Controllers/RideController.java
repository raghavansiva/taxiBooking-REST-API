package com.sr.taxi.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sr.taxi.Entity.Ride;
import com.sr.taxi.Exception.RunTimeException;
import com.sr.taxi.Repository.RideRepository;
import com.sr.taxi.Service.RideService;
import com.sr.taxi.dto.RideRequestDto;

@RestController
@RequestMapping("/rides")
public class RideController {

	@Autowired
	private RideService rideService;
	
	@Autowired
	private RideRepository rideRepo;
	
	@PostMapping("/book")
	public Ride bookRide(@RequestBody RideRequestDto request) throws RunTimeException {
		return rideService.bookRide(request);
	}
	
	@GetMapping("/history/{customerId}")
	public List<Ride> getCustomerHistory(@PathVariable int customerId) {
		return rideRepo.findAll().stream().filter(r -> r.getCustomer().getId() == customerId).toList();
	}
}

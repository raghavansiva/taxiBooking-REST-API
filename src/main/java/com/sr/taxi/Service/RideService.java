package com.sr.taxi.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sr.taxi.Entity.Customer;
import com.sr.taxi.Entity.Driver;
import com.sr.taxi.Entity.Ride;
import com.sr.taxi.Exception.RunTimeException;
import com.sr.taxi.Repository.CustomerRepository;
import com.sr.taxi.Repository.DriverRepository;
import com.sr.taxi.Repository.RideRepository;
import com.sr.taxi.dto.RideRequestDto;

@Service
public class RideService {
	@Autowired
	private DriverRepository driverRepo;
	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private RideRepository rideRepo;

	public Ride bookRide(RideRequestDto request) throws RunTimeException {
		Customer customer = customerRepo.findById(request.customerId).orElseThrow();
		List<Driver> allDrivers = driverRepo.findAll();
		List<Driver> available = new ArrayList<>();
		int min = Integer.MAX_VALUE;
		float minEarn = Float.MAX_VALUE;
		
		for(Driver d : allDrivers) {
			if(d.getFreetTime() + Math.abs(d.getCurrentSpot() - request.pickUp) <= request.pickUpTime) {
				int dist = Math.abs(d.getCurrentSpot() - request.pickUp);
				if(dist < min) {
					min = dist;
					available.clear();
				}
				if(dist == min) {
					available.add(d);
				}
			}
		}
		
		Driver selected = null;
		for(Driver d : available) {
			if(d.getTotalEarnings() < minEarn) {
				minEarn = d.getTotalEarnings();
				selected = d;
			}
		}
		if(selected == null) throw new RunTimeException("No taxi available");
		
		float fare = Math.abs(request.pickUpTime - request.drop) * 10;
		selected.setTotalEarnings(selected.getTotalEarnings() + fare);
		selected.setFreetTime(selected.getFreetTime() + Math.abs(request.pickUpTime - request.drop) + Math.abs(selected.getCurrentSpot() - request.pickUp));
		selected.setCurrentSpot(request.drop);
		
		Ride ride = new Ride();
		ride.setPickUp(request.pickUp);
		ride.setDrop(request.drop);
		ride.setPickUpTime(request.pickUpTime);
		ride.setFare(fare);
		ride.setCustomer(customer);
		ride.setDriver(selected);
		
		return rideRepo.save(ride);
	}
	
}

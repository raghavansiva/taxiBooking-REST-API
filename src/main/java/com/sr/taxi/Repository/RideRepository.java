package com.sr.taxi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.taxi.Entity.Ride;

@Repository
public interface RideRepository extends JpaRepository<Ride, Integer> {

}

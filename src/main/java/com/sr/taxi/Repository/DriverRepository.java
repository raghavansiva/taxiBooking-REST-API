package com.sr.taxi.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sr.taxi.Entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}

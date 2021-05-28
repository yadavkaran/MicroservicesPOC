package com.poc.microservices.temperatureservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TemperatureChangeRepository extends JpaRepository<TemperatureChange, Long> {
	TemperatureChange findByFromAndTo(String from, String to);

}



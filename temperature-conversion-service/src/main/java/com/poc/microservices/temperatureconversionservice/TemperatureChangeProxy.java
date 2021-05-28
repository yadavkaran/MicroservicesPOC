package com.poc.microservices.temperatureconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name="temperature-change" , url="localhost:8000")	
public interface TemperatureChangeProxy {
	
	@GetMapping("/temperature-change/from/{from}/to/{to}")
	public TemperatureConversion retrieveExchangeValue(
			@PathVariable("from") String from,
			@PathVariable("to") String to);
}

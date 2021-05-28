package com.poc.microservices.temperatureservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TemperatureChangeontroller {

	@Autowired
	private TemperatureChangeRepository repository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/temperature-change/from/{from}/to/{to}")
	public TemperatureChange retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		TemperatureChange temperatureChange = repository.findByFromAndTo(from, to);
		if(temperatureChange == null) {
			throw new RuntimeException("unable to find data for " + from +" to" +to);
		}
		
		String port = environment.getProperty("local.server.port");
		temperatureChange.setEnvironment(port);
		
		return temperatureChange;
	}
}

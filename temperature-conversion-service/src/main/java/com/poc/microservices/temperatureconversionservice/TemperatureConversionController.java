package com.poc.microservices.temperatureconversionservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemperatureConversionController {
	
	@Autowired
	private TemperatureChangeProxy proxy;
	
	@GetMapping("/temperature-conversion-feign/from/{from}/to/{to}/degree/{degree}")
		public TemperatureConversion calculateTemperatureConversion (
				@PathVariable String from,
				@PathVariable String to,
				@PathVariable BigDecimal degree) {
		TemperatureConversion temperatureConversion  = proxy.retrieveExchangeValue(from, to);
		
		return new TemperatureConversion(temperatureConversion.getId(),from,to,degree,
				temperatureConversion.getConversionMultiple(),
				temperatureConversion.getConversionVariable(),
				degree.multiply(temperatureConversion.getConversionVariable())
				.add(temperatureConversion.getConversionMultiple()),
				temperatureConversion.getEnvironment()+ " "+"feign");
		
}
}

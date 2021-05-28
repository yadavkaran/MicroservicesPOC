package com.poc.microservices.temperatureservice;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TemperatureChange {

	@Id
	private Long id;
	
	@Column(name = "temperature_from")
	private String from;
	
	@Column(name = "temperature_to")
	private String to;
	
	private BigDecimal conversionMultiple;
	
	private BigDecimal conversionVariable;
	
	private String environment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public BigDecimal getConversionVariable() {
		return conversionVariable;
	}

	public void setConversionVariable(BigDecimal conversionVariable) {
		this.conversionVariable = conversionVariable;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public TemperatureChange(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal conversionVariable) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.conversionVariable = conversionVariable;
	}
	public TemperatureChange() {
		
	}
}

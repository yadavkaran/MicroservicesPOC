package com.poc.microservices.temperatureconversionservice;

import java.math.BigDecimal;

public class TemperatureConversion {
	private Long id;
	private String from;
	private String to;
	private BigDecimal degree;
	private BigDecimal conversionMultiple;
	private BigDecimal conversionVariable;
	private BigDecimal totalCalculateddegree;
	private String Environment;

	public TemperatureConversion() {

	}

	public TemperatureConversion(Long id, String from, String to, BigDecimal degree, BigDecimal conversionMultiple,
			BigDecimal conversionVariable, BigDecimal totalCalculateddegree, String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.degree = degree;
		this.conversionMultiple = conversionMultiple;
		this.conversionVariable = conversionVariable;
		this.totalCalculateddegree = totalCalculateddegree;
		Environment = environment;
	}

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

	public BigDecimal getDegree() {
		return degree;
	}

	public void setDegree(BigDecimal degree) {
		this.degree = degree;
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

	public BigDecimal getTotalCalculateddegree() {
		return totalCalculateddegree;
	}

	public void setTotalCalculateddegree(BigDecimal totalCalculateddegree) {
		this.totalCalculateddegree = totalCalculateddegree;
	}

	public String getEnvironment() {
		return Environment;
	}

	public void setEnvironment(String environment) {
		Environment = environment;
	}

}

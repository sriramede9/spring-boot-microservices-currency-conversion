package com.sri.config;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	private long id;

	@Column(name = "fromvalue")
	private String from;

	private String to;

	private double multiplicationFactor;

	public ExchangeValue() {
		super();
	}

	public ExchangeValue(long id, String from, String to, double multiplicationFactor) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.multiplicationFactor = multiplicationFactor;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public double getMultiplicationFactor() {
		return multiplicationFactor;
	}

	public void setMultiplicationFactor(double multiplicationFactor) {
		this.multiplicationFactor = multiplicationFactor;
	}

	@Override
	public String toString() {
		return "ExchangeValue [id=" + id + ", from=" + from + ", to=" + to + ", multiplicationFactor="
				+ multiplicationFactor + "]";
	}

}

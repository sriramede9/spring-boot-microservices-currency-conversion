package com.sri.config;

public class CurrencyConversionBean {

	private int id;

	private String from;

	private String to;

	private double calculatedAmount;

	private double multiplicationFactor;

	private double quantity;

	private int port;

	public CurrencyConversionBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CurrencyConversionBean(int id, String from, String to, double calculatedAmount, double multiplicationFactor,
			double quantity, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.calculatedAmount = calculatedAmount;
		this.multiplicationFactor = multiplicationFactor;
		this.quantity = quantity;
		this.port = port;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public double getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(double calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	public double getMultiplicationFactor() {
		return multiplicationFactor;
	}

	public void setMultiplicationFactor(double multiplicationFactor) {
		this.multiplicationFactor = multiplicationFactor;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CurrencyConversionBean [id=" + id + ", from=" + from + ", to=" + to + ", calculatedAmount="
				+ calculatedAmount + ", multiplicationFactor=" + multiplicationFactor + ", quantity=" + quantity
				+ ", port=" + port + "]";
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}

package com.sri.limit;

import org.springframework.beans.factory.annotation.Value;

public class Limitconfiguration {

	private int max;

	private int min;

	public Limitconfiguration() {
		super();
	}

	public Limitconfiguration(int max, int min) {
		super();
		this.max = max;
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	@Override
	public String toString() {
		return "Limitconfiguration [max=" + max + ", min=" + min + "]";
	}

}

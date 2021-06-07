package com.sri.limit;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Configuration {

	@Value("${max.value}")
	private int max;
	@Value("${min.value}")
	private int min;

	public Configuration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Configuration(int max, int min) {
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
		return "Configuration [max=" + max + ", min=" + min + "]";
	}

}

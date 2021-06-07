package com.sri.limit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

	@Autowired
	private Configuration config;

	@GetMapping("/limits")
	public Limitconfiguration retrieveLimitsFromConfigurations() {
		return new Limitconfiguration(config.getMax(), config.getMin());
	}
}

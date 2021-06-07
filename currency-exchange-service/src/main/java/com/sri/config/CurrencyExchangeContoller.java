package com.sri.config;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeContoller {
	
	private final static Logger log = LoggerFactory.getLogger(CurrencyExchangeContoller.class);

	@Autowired
	private ExchangeValueRepository evR;
	
	@Autowired
	private Environment environment;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to) {

		log.info("Returning value from port \t"+environment.getProperty("local.server.port"));
		
		return evR.findByFromAndTo(from, to).get();
	}

	@PostMapping("/add-currency")
	public void addCurrency(@RequestBody ExchangeValue exchangeValue) {
		evR.save(exchangeValue);
	}
}

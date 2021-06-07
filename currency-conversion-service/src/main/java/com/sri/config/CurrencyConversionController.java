package com.sri.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {

	@Autowired
	private Environment env;

	@Autowired
	private CurrencyExchangeServiceProxy currencyExchangeServiceProxy;

	@GetMapping("currency-converter/from/{from}/to/{to}/{value}")
	public CurrencyConversionBean convertCurrency(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable("value") int value) {

		RestTemplate restTemplate = new RestTemplate();

		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<CurrencyConversionBean> forEntity = restTemplate.getForEntity(
				"http://localhost:8001/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);

		CurrencyConversionBean body = null;
		if (forEntity.hasBody()) {
			body = forEntity.getBody();
		}

		return new CurrencyConversionBean(1, from, to, value * body.getMultiplicationFactor(),
				body.getMultiplicationFactor(), value, Integer.parseInt(env.getProperty("local.server.port")));
	}

	@GetMapping("currency-converter-proxy/from/{from}/to/{to}/{value}")
	public CurrencyConversionBean converCurrencyProxy(@PathVariable("from") String from, @PathVariable("to") String to,
			@PathVariable("value") int value) {

		RestTemplate restTemplate = new RestTemplate();

//		Map<String, String> uriVariables = new HashMap<String, String>();
//		uriVariables.put("from", from);
//		uriVariables.put("to", to);
//		ResponseEntity<CurrencyConversionBean> forEntity = restTemplate.getForEntity(
//				"http://localhost:8001/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
//				uriVariables);

		CurrencyConversionBean body = currencyExchangeServiceProxy.getExchangeValue(from, to);
//		if (forEntity.hasBody()) {
//			body = forEntity.getBody();
//		}

		return new CurrencyConversionBean(1, from, to, value * body.getMultiplicationFactor(),
				body.getMultiplicationFactor(), value, Integer.parseInt(env.getProperty("local.server.port")));
	}
}

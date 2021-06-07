package com.sri.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//url and port
//@FeignClient(url = "http://localhost:8001", name = "currency-exchange-service")
//http://localhost:8765/currency-exchange-service
//@FeignClient(name = "currency-exchange-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeServiceProxy {

	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	CurrencyConversionBean getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);
}

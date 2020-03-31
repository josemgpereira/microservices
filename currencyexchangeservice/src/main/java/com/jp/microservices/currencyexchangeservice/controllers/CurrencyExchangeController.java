package com.jp.microservices.currencyexchangeservice.controllers;

import com.jp.microservices.currencyexchangeservice.models.ExchangeValue;
import com.jp.microservices.currencyexchangeservice.services.ExchangeValueService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private ExchangeValueService exchangeValueService;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
         return exchangeValueService.findByFromAndTo(from, to);
    }
}
package com.jp.microservices.currencyexchangeservice.services;

import com.jp.microservices.currencyexchangeservice.models.ExchangeValue;

public interface ExchangeValueService {
    ExchangeValue findByFromAndTo(String from, String to);
}
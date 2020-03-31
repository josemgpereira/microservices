package com.jp.microservices.currencyexchangeservice.services;

import com.jp.microservices.currencyexchangeservice.models.ExchangeValue;
import com.jp.microservices.currencyexchangeservice.repositories.ExchangeValueRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExchangeValueServiceImpl implements ExchangeValueService {

    private final ExchangeValueRepository exchangeRepository;
    private final Environment environment;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public ExchangeValue findByFromAndTo(String from, String to) {
        ExchangeValue exchangeValue = exchangeRepository.findByFromAndTo(from ,to);
        exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
        logger.info("{}", exchangeValue);
        return exchangeValue;
    }
}
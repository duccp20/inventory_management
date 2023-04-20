package com.example.inventory_management.repository.jpa;

import com.example.inventory_management.model.entity.ExchangeRateEntity;
import com.example.inventory_management.repository.ExchangeRateRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ExchangeRateRepositoryImpl {

    private final ExchangeRateRepository exchange;

    public ExchangeRateRepositoryImpl(ExchangeRateRepository exchange) {
        this.exchange = exchange;
    }

    public List<ExchangeRateEntity> findAll() {
        return exchange.findAll();
    }
}

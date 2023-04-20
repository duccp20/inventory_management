package com.example.inventory_management.service.Impl;

import com.example.inventory_management.model.entity.ExchangeRateEntity;
import com.example.inventory_management.repository.ExchangeRateRepository;
import com.example.inventory_management.service.ExchangeRateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExchangeRateServiceImpl implements ExchangeRateService {

    private final ExchangeRateRepository exchangeRateRepository;

    public ExchangeRateServiceImpl(ExchangeRateRepository exchangeRateRepository) {
        this.exchangeRateRepository = exchangeRateRepository;
    }

    @Override
    public List<ExchangeRateEntity> findAll() {
        return exchangeRateRepository.findAll();
    }
}

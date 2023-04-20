package com.example.inventory_management.repository.jpa;

import com.example.inventory_management.model.entity.FactoryEntity;
import com.example.inventory_management.repository.FactoryRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FactoryRepositoryImpl {
    public final FactoryRepository factoryRepository;

    public FactoryRepositoryImpl(FactoryRepository factoryRepository) {
        this.factoryRepository = factoryRepository;
    }

    public List<FactoryEntity> findAll() {
        return  factoryRepository.findAll();
    }
}

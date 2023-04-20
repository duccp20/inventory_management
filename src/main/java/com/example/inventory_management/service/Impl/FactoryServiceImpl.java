package com.example.inventory_management.service.Impl;

import com.example.inventory_management.model.entity.FactoryEntity;
import com.example.inventory_management.repository.FactoryRepository;
import com.example.inventory_management.service.FactoryService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FactoryServiceImpl implements FactoryService {

    private FactoryRepository factoryRepository;
    @Override
    public List<FactoryEntity> findAll() {
        return factoryRepository.findAll();
    }
}

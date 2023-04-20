package com.example.inventory_management.service;

import com.example.inventory_management.model.entity.FactoryEntity;

import java.util.List;


public interface FactoryService {

    List<FactoryEntity> findAll();
}

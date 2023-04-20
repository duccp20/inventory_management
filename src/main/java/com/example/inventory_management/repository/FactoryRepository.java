package com.example.inventory_management.repository;

import com.example.inventory_management.model.entity.FactoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactoryRepository extends JpaRepository<FactoryEntity, String> {
}

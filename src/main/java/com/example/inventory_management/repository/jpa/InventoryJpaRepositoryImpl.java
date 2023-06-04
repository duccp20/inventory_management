//package com.example.inventory_management.repository.jpa;
//
//import com.example.inventory_management.model.entity.InventoryEntity;
//import com.example.inventory_management.repository.InventoryRepository;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class InventoryJpaRepositoryImpl {
//    private final InventoryRepository inventoryRepository;
//
//
//    public InventoryJpaRepositoryImpl(@Lazy InventoryRepository inventoryRepository) {
//        this.inventoryRepository = inventoryRepository;
//    }
//
//    public List<InventoryEntity> findAll(){
//        return inventoryRepository.findAll();
//    }
//}

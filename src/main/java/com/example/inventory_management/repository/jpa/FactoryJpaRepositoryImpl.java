//package com.example.inventory_management.repository.jpa;
//
//import com.example.inventory_management.model.entity.FactoryEntity;
//import com.example.inventory_management.repository.FactoryRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Lazy;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public class FactoryJpaRepositoryImpl {
//    public final FactoryRepository factoryRepository;
//
//    @Autowired
//    public FactoryJpaRepositoryImpl(FactoryRepository factoryRepository) {
//        this.factoryRepository = factoryRepository;
//    }
//
//    public List<FactoryEntity> findAll() {
//        return  factoryRepository.findAll();
//    }
//}

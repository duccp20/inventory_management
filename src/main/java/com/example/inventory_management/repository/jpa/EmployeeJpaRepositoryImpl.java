package com.example.inventory_management.repository.jpa;

import com.example.inventory_management.model.entity.EmployeeEntity;
import com.example.inventory_management.repository.EmployeeRepository;
import org.springframework.stereotype.Component;

import java.util.List;

//thao tac vs sql

@Component //la 1 bean
public class EmployeeJpaRepositoryImpl {

    private final EmployeeRepository employeeRepository;

    public EmployeeJpaRepositoryImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }
}

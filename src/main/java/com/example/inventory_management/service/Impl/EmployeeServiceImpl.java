package com.example.inventory_management.service.Impl;

import com.example.inventory_management.model.entity.EmployeeEntity;
import com.example.inventory_management.repository.EmployeeRepository;
import com.example.inventory_management.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeRepository employeeRepository;
    @Override
    public List<EmployeeEntity> findAll() {
        return employeeRepository.findAll();
    }
}

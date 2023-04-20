package com.example.inventory_management.service;

import com.example.inventory_management.model.entity.EmployeeEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {

    List<EmployeeEntity> findAll();
}

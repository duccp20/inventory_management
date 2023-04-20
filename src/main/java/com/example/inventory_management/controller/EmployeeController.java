package com.example.inventory_management.controller;

import com.example.inventory_management.model.entity.EmployeeEntity;
import com.example.inventory_management.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employee")
    public String findAll(Model model ) {
        List<EmployeeEntity> resp = employeeService.findAll();
        model.addAttribute("listALl", resp);
        return "index";
    }
}

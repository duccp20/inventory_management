package com.example.inventory_management.controller;

import com.example.inventory_management.model.entity.FactoryEntity;
import com.example.inventory_management.service.FactoryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FactoryController {

    private FactoryService factoryService;

    public FactoryController(FactoryService factoryService) {
        this.factoryService = factoryService;
    }

    @GetMapping("/factory")
    public String findAll(Model model) {
        List<FactoryEntity> resp = factoryService.findAll();
        model.addAttribute("list", resp);
        return "factory";
    }
}

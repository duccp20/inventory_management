package com.example.inventory_management.controller;


import com.example.inventory_management.model.entity.ExchangeRateEntity;
import com.example.inventory_management.service.ExchangeRateService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ExchangeRateController {

    private final ExchangeRateService exchangeRateService;

    public ExchangeRateController(ExchangeRateService exchangeRateService) {
        this.exchangeRateService = exchangeRateService;
    }

    @GetMapping("/exchangeRate")
    public String findAll(Model model) {
        List<ExchangeRateEntity> resp = exchangeRateService.findAll();
        model.addAttribute("listAll", resp);
        return "exchangeRate";
    }
}

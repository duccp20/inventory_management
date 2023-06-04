//package com.example.inventory_management.controller;
//
//import com.example.inventory_management.model.entity.FactoryEntity;
//import com.example.inventory_management.service.FactoryService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class FactoryController {
//
//    @Autowired
//    private  FactoryService factoryService;
//
//
//    @GetMapping("/factory")
//    public List<FactoryEntity> index(Model model) {
//        List<FactoryEntity> list = factoryService.searchAll();
//        model.addAttribute("listF", list);
//        return list;
//    }
//
//    @GetMapping("/hello")
//    public String test() {
//        return "index";
//    }
//}

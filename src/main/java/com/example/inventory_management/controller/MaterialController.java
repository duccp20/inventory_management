//package com.example.inventory_management.controller;
//
//import com.example.inventory_management.model.entity.MaterialEntity;
//import com.example.inventory_management.service.MaterialService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//
//import java.util.List;
//
//@Controller
//public class MaterialController {
//    @Autowired
//    private MaterialService materialService;
//
//
//    @GetMapping("/material/view")
//    public String view(Model model) {
//        List<MaterialEntity> list = materialService.searchAll();
//        model.addAttribute("listM", list);
//        return "material/view";
//    }
//}

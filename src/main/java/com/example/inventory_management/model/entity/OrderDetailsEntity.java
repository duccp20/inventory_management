//package com.example.inventory_management.model.entity;
//
//
//import com.example.inventory_management.model.OrderDetailID;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Table(name = "order_detail")
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//@Embeddable
//public class OrderDetailsEntity {
//    @Id
//    @Column(name = "order_id")
//    private  String orderID;
//    @EmbeddedId
//    private OrderDetailID orderDetailID;
//
//    @Column(name = "line_id")
//    private String factoryID;
//
//    @Column(name = "material_id")
//    private String materialID;
//
//    @Column(name = "quantity")
//    private Integer quantity;
//
//    @Column(name = "price")
//    private Double price;
//}

//package com.example.inventory_management.model.entity;
//
//import com.example.inventory_management.model.ReturnDetailsID;
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Entity
//@Data
//@Table(name = "RETURN_DETAILS")
//@AllArgsConstructor
//@NoArgsConstructor
//public class ReturnDetailsEntity {
//
//    @Id
//    @Column(name = " return_id")
//    private  String returnID;
//
//    @EmbeddedId
//    private ReturnDetailsID returnDetailsID;
//
//    @Column(name = "returndetail_id")
//    private String returnDetailID;
//
//    @Column(name = "material_id")
//    private  String materialID;
//    @Column(name = "quantity")
//    private  Integer quantity;
//
//    @Column(name = "reason")
//    private  String reason;
//
//}

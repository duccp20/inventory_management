package com.example.inventory_management.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryEntity {
    @Id
    @Column(name = "inventory_id")
    private String inventoryID;

    @Column(name = "factory_id")
    private String factoryID;

    @Column(name = "orderNo")
    private String orderNo;

    @Column(name = "material_id")
    private String materialID;

    @Column(name = "quantity")
    private Integer quantity;
}

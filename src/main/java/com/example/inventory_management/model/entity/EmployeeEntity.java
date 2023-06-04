package com.example.inventory_management.model.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeEntity {

    @Id
    @Column(name = "employee_id")
    private String employeeID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "DOB")
    private Date birthDay;

    @Column(name = "StartWorking_date")
    private Date startWorking;

    @Column(name = "EndWorking_date")
    private Date endWorking;

    @Column(name = "manager_id")
    private String managerID;
}

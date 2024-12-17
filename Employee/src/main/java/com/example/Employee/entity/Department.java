package com.example.Employee.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "departments")
@Data
public class Department {

    @Id
    private long id;

    @Column(nullable = false, unique = true)
    private String departmentName;
    
}

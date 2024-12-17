package com.example.Employee.entity;


import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "Employee")
@Data
public class EmployeeTable {

    @Id
    private long id;

    @Column(nullable = false)
    private String empname;

    @ManyToMany
    @JoinTable(
        name = "employee_departments", 
        joinColumns = @JoinColumn(name = "employee_id"), 
        inverseJoinColumns = @JoinColumn(name = "department_id")
    )
    private List<Department> departments;

    @Column(nullable = false)
    private long salary;


    
}

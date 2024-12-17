package com.example.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee.entity.Department;
@Repository
public interface DepartmentRepo extends JpaRepository<Department,Long>{
    
}

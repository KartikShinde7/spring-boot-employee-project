package com.example.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Employee.entity.Department;
import com.example.Employee.entity.EmployeeTable;
import com.example.Employee.repository.DepartmentRepo;
import com.example.Employee.repository.EmployeeRepository;


@Service
public class EmployeeService  implements EmployeeServiceINT{

    @Autowired
    public EmployeeRepository repository;
    @Autowired
    public DepartmentRepo deptRepository;

    @Override
    public EmployeeTable saveEmployee(EmployeeTable employee) {
        return repository.save(employee);
    }
   

    public EmployeeTable addEmployee(EmployeeTable employee){
        return repository.save(employee);
        
    }

    public List<EmployeeTable> getAllEmployee(){
        return repository.findAll();
    }

    public EmployeeTable getEmployeeById(long id){
        return repository.findById(id).orElse(null);
    }

    public String deleteEmployee(Long id){
        repository.deleteById(id);
        return "Employee deleted Succesfully";
    }


   // ---------------------------------------------------------------------------------------
    
    public Department addDepartment(Department department){
        return deptRepository.save(department);
    }

    public List<Department> listDepartments(){
        return deptRepository.findAll();
    }

    // public List<EmployeeDepartmentDTO> getEmployeeWithDepartments(Long employeeId) {
    //     return empDepetRepo.findEmployeeWithDepartments(employeeId);
    // }





}

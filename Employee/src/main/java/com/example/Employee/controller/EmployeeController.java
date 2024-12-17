package com.example.Employee.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.Employee.entity.Department;
import com.example.Employee.entity.EmployeeTable;
import com.example.Employee.service.EmployeeService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

//----------------------  Employee  APIS -------------------------------------------------
    @GetMapping("/list")
    public List<EmployeeTable> getEmployee(){
        return service.getAllEmployee();
    }


    @PostMapping
    public EmployeeTable createEmployee(@RequestBody EmployeeTable employee) {
        return service.saveEmployee(employee);
    }

    @PostMapping("/addEmployee")
    public EmployeeTable addEmployee(@RequestBody EmployeeTable employee) {
        return service.addEmployee(employee);
    }

    @GetMapping("{id}")
    public EmployeeTable getEmployeeById(@PathVariable long id) {
        return service.getEmployeeById(id);
    }

    @PutMapping("{id}")
    public EmployeeTable updateEmployee(@PathVariable long id, @RequestBody EmployeeTable employee){
        employee.setId(id);
        return service.addEmployee(employee);
    }
    
    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable long id){
        return service.deleteEmployee(id);
    }
    
// -----------------  Department API's  -----------------------------------------------------------------
    
    @PostMapping("/addDept")
    public Department addDepartment(@RequestBody Department department){
        return service.addDepartment(department);
    }
    
    @GetMapping("/listDept")
    public List<Department> listDepartments(){
        return service.listDepartments();
    }

    // @GetMapping("/empDept/{id}")
    // public List<EmployeeDepartmentDTO> getEmployeeWithDepartments(@PathVariable Long id) {
    //     return service.getEmployeeWithDepartments(id);
    // }
}

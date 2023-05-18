package com.amandatao.employee.service.controller;

import com.amandatao.employee.service.dto.EmployeeDepartmentResponse;
import com.amandatao.employee.service.entity.Employee;
import com.amandatao.employee.service.service.EmployeeService;
import com.amandatao.employee.service.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/employees")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }

    @PostMapping
    public Employee saveEmployee(@RequestBody Employee newEmployee){
        return employeeService.saveEmployee(newEmployee);
    }

    @GetMapping("/department/{id}")
    public EmployeeDepartmentResponse getEmployeeWithDepartment(@PathVariable("id") Long employeeId){
        return employeeService.getEmployeeWithDepartment(employeeId);

    }


}

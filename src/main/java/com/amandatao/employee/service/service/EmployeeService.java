package com.amandatao.employee.service.service;

import com.amandatao.employee.service.dto.EmployeeDepartmentResponse;
import com.amandatao.employee.service.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getEmployeeById(Long employeeId);
    Employee saveEmployee(Employee newEmployee);

    EmployeeDepartmentResponse getEmployeeWithDepartment(Long employeeId);
}

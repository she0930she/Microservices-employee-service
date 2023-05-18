package com.amandatao.employee.service.service.impl;

import com.amandatao.employee.service.dto.Department;
import com.amandatao.employee.service.dto.EmployeeDepartmentResponse;
import com.amandatao.employee.service.entity.Employee;
import com.amandatao.employee.service.repository.EmployeeRepository;
import com.amandatao.employee.service.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private RestTemplate restTemplate; // make a rest call

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long employeeId) {
        return employeeRepository.findById(employeeId).get();
    }


    @Override
    public Employee saveEmployee(Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    @Override
    public EmployeeDepartmentResponse getEmployeeWithDepartment(Long employeeId) {

        // get emp
        Employee employee = employeeRepository.findById(employeeId).get();


        // get department
        Department department = restTemplate.getForObject("http://localhost:9001/api/departments/"+
                employee.getDepartmentId(),
                Department.class);

        EmployeeDepartmentResponse responseDto = new EmployeeDepartmentResponse();
        responseDto.setEmployee(employee);
        responseDto.setDepartment(department);

        return responseDto;
    }
}

package com.amandatao.employee.service.dto;

import com.amandatao.employee.service.entity.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDepartmentResponse {

    private Employee employee;
    private Department department;
}

package com.amandatao.employee.service.repository;

import com.amandatao.employee.service.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

package com.amandatao.employee.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

// @Entity , do not write this to create a new table!!!
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {

    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
}

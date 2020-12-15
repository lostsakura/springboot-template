package com.ls.employee.entity;

import lombok.Data;

@Data
public class EmployeeVO {

    private Long employeeId;
    private String employeeFirstName;
    private String employeeLastName;
    private String employeeEmail;
    private String employeeGender;
}

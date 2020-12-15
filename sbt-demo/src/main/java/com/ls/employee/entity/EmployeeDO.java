package com.ls.employee.entity;

import com.ls.department.entity.DepartmentDO;
import lombok.Data;

@Data
public class EmployeeDO {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
}

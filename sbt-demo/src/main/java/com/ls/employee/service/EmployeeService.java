package com.ls.employee.service;

import com.ls.employee.entity.EmployeeDO;

import java.util.List;

public interface EmployeeService {

    EmployeeDO getEmployeeById(Long id);
    List<EmployeeDO> getAllEmployee();
    Integer insertEmployee(EmployeeDO employeeDO);
    Integer deleteEmployeeById(Long id);
    Integer batchDelete(List<Long> idList);
    Integer updateEmployee(EmployeeDO employeeDO);
}

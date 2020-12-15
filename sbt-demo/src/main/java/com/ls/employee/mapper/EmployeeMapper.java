package com.ls.employee.mapper;

import com.ls.employee.entity.EmployeeDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface EmployeeMapper {

    EmployeeDO getEmployeeById(Long id);
    List<EmployeeDO> getAllEmployee();
    Integer insertEmployee(EmployeeDO employeeDO);
    Integer deleteEmployeeById(Long id);
    Integer updateEmployee(EmployeeDO employeeDO);
}

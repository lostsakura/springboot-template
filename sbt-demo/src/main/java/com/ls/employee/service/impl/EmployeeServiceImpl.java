package com.ls.employee.service.impl;

import com.ls.employee.entity.EmployeeDO;
import com.ls.employee.mapper.EmployeeMapper;
import com.ls.employee.service.EmployeeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Resource
    EmployeeMapper employeeMapper;

    @Override
    public EmployeeDO getEmployeeById(Long id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public List<EmployeeDO> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public Integer updateEmployee(EmployeeDO employeeDO) {
        return employeeMapper.updateEmployee(employeeDO);
    }

    @Override
    public Integer insertEmployee(EmployeeDO employeeDO) {
        return employeeMapper.insertEmployee(employeeDO);
    }

    @Override
    public Integer deleteEmployeeById(Long id) {
        return employeeMapper.deleteEmployeeById(id);
    }

    @Override
    public Integer batchDelete(List<Long> idList) {
        int count = 0;
        for(Long id : idList) {
            Integer num = employeeMapper.deleteEmployeeById(id);
            count += num;
        }
        return count;
    }

}

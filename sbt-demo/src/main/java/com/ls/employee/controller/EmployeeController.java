package com.ls.employee.controller;

import com.ls.employee.entity.EmployeeDO;
import com.ls.employee.entity.EmployeeVO;
import com.ls.employee.mapper.EmployeeMapper;
import com.ls.employee.service.EmployeeService;
import com.ls.employee.service.impl.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@Slf4j
@RequestMapping("/employees")
@RestController
public class EmployeeController {

    @Resource
    EmployeeServiceImpl employeeService;

    @GetMapping("/{id}")
    public EmployeeDO get(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("")
    public List<EmployeeDO> list() {
        List<EmployeeDO> allEmployee = employeeService.getAllEmployee();
        return allEmployee;
    }


    @PostMapping("")
    public Integer create(EmployeeDO employeeDO) {
        return employeeService.insertEmployee(employeeDO);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable("id") Long id) {
        return employeeService.deleteEmployeeById(id);
    }

    @PutMapping("")
    public Integer update(EmployeeDO employeeDO) {
        return employeeService.updateEmployee(employeeDO);
    }
}

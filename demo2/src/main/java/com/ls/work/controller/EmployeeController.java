package com.ls.work.controller;

import com.ls.work.domain.DO.EmployeeDO;
//import com.ls.work.service.EmployeeService;
import com.ls.work.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/work/employees")
@RestController
public class EmployeeController {


    @Resource
    private EmployeeMapper employeeMapper;

    @GetMapping("/{id}")
    public EmployeeDO get(@PathVariable("id")Long id) {
        return employeeMapper.selectById(id);
    }
}

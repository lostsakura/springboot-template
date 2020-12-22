package com.ls.work.domain.DO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "t_employee")
@Data
public class EmployeeDO {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField(value = "employee_name")
    private String employeeName;

    private Long departmentId;
}

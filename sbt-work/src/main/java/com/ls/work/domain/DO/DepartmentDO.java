package com.ls.work.domain.DO;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName("t_department")
@Data
public class DepartmentDO {
    private Long id;

    private String departmentName;
}

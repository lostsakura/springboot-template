package com.ls.sys.auth.domain.DO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ls.sys.core.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@JsonIgnoreProperties(value = { "handler"})
public class SysRoleDO extends BaseDO {
    private Long id;

    private String roleName;

    private Integer enabled;

    private Long createBy;

    private Date createTime;

    private List<SysPrivilegeDO> privilegeList;

}
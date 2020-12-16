package com.ls.sys.auth.domain.VO;

import com.ls.sys.auth.domain.DO.SysPrivilegeDO;
import com.ls.sys.core.domain.BaseVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysRoleVO extends BaseVO {
    private Long id;

    private String name;

    private String enabled;

    private Long createBy;

    private Date createTime;

    private List<SysPrivilegeDO> privilegeList;

}

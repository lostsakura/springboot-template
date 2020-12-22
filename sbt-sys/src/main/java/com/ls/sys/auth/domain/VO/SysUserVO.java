package com.ls.sys.auth.domain.VO;

import com.ls.sys.auth.domain.DO.SysRoleDO;
import com.ls.sys.core.domain.BaseVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysUserVO extends BaseVO {
    private Long id;

    private String name;

    private String password;

    private String email;

    private Date createTime;

    private String info;

    private List<SysRoleDO> roleList;

}

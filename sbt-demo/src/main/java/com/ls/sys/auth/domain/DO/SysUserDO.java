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
public class SysUserDO extends BaseDO {
    private Long id;

    private String userName;

    private String userPassword;

    private String userEmail;

    private Date createTime;

    private String userInfo;

    private byte[] userAvatar;

    private List<SysRoleDO> roleList;

}
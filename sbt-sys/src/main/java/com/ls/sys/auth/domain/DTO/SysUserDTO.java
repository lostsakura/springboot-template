package com.ls.sys.auth.domain.DTO;

import com.ls.sys.core.domain.BaseDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysUserDTO extends BaseDTO {
    private Long id;

    private String name;

    private String password;

    private String email;

    private Date createTime;

    private String info;

    private byte[] avatar;
}

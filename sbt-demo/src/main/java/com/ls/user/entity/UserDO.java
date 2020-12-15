package com.ls.user.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

@Alias("user")
@Data
@Accessors(chain = true)
public class UserDO {

    private Long id;
    private String name;
    private String password;
}

package com.ls.user.entity;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.Alias;

@Data
@Accessors(chain = true)
public class UserVO {

    private Long userId;
    private String userName;
    private String userPassword;
}

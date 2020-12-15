package com.ls.user.mapper;

import com.ls.user.entity.UserDO;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

public interface UserMapper {

    @Select("select * from t_user where id = #{id}")
    public UserDO getUserById(Long id);

    @Delete("delete from t_user where id = #{id}")
    public int deleteUserById(Long id);

    @Options(useGeneratedKeys = true, keyProperty = "id") // 设置id为自增主键
    @Insert("insert into t_user(name, password) values(#{name}, #{password})")
    public int insertUser(UserDO userDO);

    @Update("update t_user set name = #{name}, password = #{password} where id = #{id}")
    public int updateUser(UserDO userDO);

    @Select("select * from t_user")
    public ArrayList<UserDO> getUserList();
}

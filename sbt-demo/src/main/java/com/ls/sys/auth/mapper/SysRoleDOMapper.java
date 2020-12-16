package com.ls.sys.auth.mapper;

import com.ls.sys.auth.domain.DO.SysRoleDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysRoleDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysRoleDO record);

    SysRoleDO selectByPrimaryKey(Long id);

    List<SysRoleDO> selectAll();

    int updateByPrimaryKey(SysRoleDO record);

    List<SysRoleDO> selectSysRoleDOBySysUserId(@Param("userId") Long userId);
}
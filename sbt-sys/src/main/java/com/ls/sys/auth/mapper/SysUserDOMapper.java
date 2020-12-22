package com.ls.sys.auth.mapper;

import com.ls.sys.auth.domain.DO.SysUserDO;
import org.apache.ibatis.annotations.CacheNamespaceRef;

import java.util.List;

public interface SysUserDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysUserDO record);

    SysUserDO selectByPrimaryKey(Long id);

    List<SysUserDO> selectAll();

    int updateByPrimaryKey(SysUserDO record);

}
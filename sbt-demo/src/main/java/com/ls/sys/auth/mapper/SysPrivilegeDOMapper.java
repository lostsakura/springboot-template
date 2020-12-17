package com.ls.sys.auth.mapper;

import com.ls.sys.auth.domain.DO.SysPrivilegeDO;
import org.apache.ibatis.annotations.CacheNamespaceRef;

import java.util.List;

public interface SysPrivilegeDOMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SysPrivilegeDO record);

    SysPrivilegeDO selectByPrimaryKey(Long id);

    List<SysPrivilegeDO> selectAll();

    int updateByPrimaryKey(SysPrivilegeDO record);

    List<SysPrivilegeDO> selectSysPrivilegeDOBySysRoleId(Long roleId);
}
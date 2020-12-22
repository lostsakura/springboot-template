package com.ls.sys.auth.service;

import com.ls.sys.auth.domain.DO.SysRoleDO;

import java.util.List;

public interface SysRoleService {

    SysRoleDO selectSysRoleDOById(Long id);

    List<SysRoleDO> selectAllSysRoleDO();

    int insertSysRoleDO(SysRoleDO sysRoleDO);

    int updateSysRoleDO(SysRoleDO sysRoleDO);

    int deleteSysRoleDOById(Long id);
}

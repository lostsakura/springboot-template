package com.ls.sys.auth.service;


import com.ls.sys.auth.domain.DO.SysUserDO;

import java.util.List;

public interface SysUserService {

    SysUserDO selectSysUserDOById(Long id);

    List<SysUserDO> selectAllSysUserDO();

    int insertSysUserDO(SysUserDO sysUserDO);

    int updateSysUserDO(SysUserDO sysUserDO);

    int deleteSysUserDO(Long id);

}

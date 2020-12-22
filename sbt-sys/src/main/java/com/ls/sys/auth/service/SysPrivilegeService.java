package com.ls.sys.auth.service;

import com.ls.sys.auth.domain.DO.SysPrivilegeDO;

import java.util.List;

public interface SysPrivilegeService {

    SysPrivilegeDO selectSysPrivilegeDOById(Long id);

    List<SysPrivilegeDO> selectAllSysPrivilegeDO();

    int insertSysPrivilegeDO(SysPrivilegeDO sysPrivilegeDO);

    int updateSysPrivilegeDO(SysPrivilegeDO sysPrivilegeDO);

    int deleteSysPrivilegeDOById(Long id);
}

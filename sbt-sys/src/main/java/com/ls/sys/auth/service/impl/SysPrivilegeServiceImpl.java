package com.ls.sys.auth.service.impl;

import com.ls.sys.auth.domain.DO.SysPrivilegeDO;
import com.ls.sys.auth.mapper.SysPrivilegeDOMapper;
import com.ls.sys.auth.service.SysPrivilegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysPrivilegeServiceImpl implements SysPrivilegeService {

    @Resource
    private SysPrivilegeDOMapper sysPrivilegeDOMapper;

    @Override
    public SysPrivilegeDO selectSysPrivilegeDOById(Long id) {
        return sysPrivilegeDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysPrivilegeDO> selectAllSysPrivilegeDO() {
        return sysPrivilegeDOMapper.selectAll();
    }

    @Override
    public int insertSysPrivilegeDO(SysPrivilegeDO sysPrivilegeDO) {
        return sysPrivilegeDOMapper.insert(sysPrivilegeDO);
    }

    @Override
    public int updateSysPrivilegeDO(SysPrivilegeDO sysPrivilegeDO) {
        return sysPrivilegeDOMapper.updateByPrimaryKey(sysPrivilegeDO);
    }

    @Override
    public int deleteSysPrivilegeDOById(Long id) {
        return sysPrivilegeDOMapper.deleteByPrimaryKey(id);
    }
}

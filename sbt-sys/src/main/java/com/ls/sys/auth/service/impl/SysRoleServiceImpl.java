package com.ls.sys.auth.service.impl;

import com.ls.sys.auth.domain.DO.SysRoleDO;
import com.ls.sys.auth.mapper.SysRoleDOMapper;
import com.ls.sys.auth.service.SysRoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Resource
    private SysRoleDOMapper sysRoleDOMapper;

    @Override
    public SysRoleDO selectSysRoleDOById(Long id) {
        return sysRoleDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysRoleDO> selectAllSysRoleDO() {
        return sysRoleDOMapper.selectAll();
    }

    @Override
    public int insertSysRoleDO(SysRoleDO sysRoleDO) {
        return sysRoleDOMapper.insert(sysRoleDO);
    }

    @Override
    public int updateSysRoleDO(SysRoleDO sysRoleDO) {
        return sysRoleDOMapper.updateByPrimaryKey(sysRoleDO);
    }

    @Override
    public int deleteSysRoleDOById(Long id) {
        return sysRoleDOMapper.deleteByPrimaryKey(id);
    }
}

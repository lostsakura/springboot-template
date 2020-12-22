package com.ls.sys.auth.service.impl;

import com.ls.sys.auth.domain.DO.SysUserDO;
import com.ls.sys.auth.mapper.SysUserDOMapper;
import com.ls.sys.auth.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserDOMapper sysUserDOMapper;

    @Override
    public SysUserDO selectSysUserDOById(Long id) {
        return sysUserDOMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SysUserDO> selectAllSysUserDO() {
        return sysUserDOMapper.selectAll();
    }

    @Override
    public int insertSysUserDO(SysUserDO sysUserDO) {
        return sysUserDOMapper.insert(sysUserDO);
    }

    @Override
    public int updateSysUserDO(SysUserDO sysUserDO) {
        return sysUserDOMapper.insert(sysUserDO);
    }

    @Override
    public int deleteSysUserDOById(Long id) {
        return sysUserDOMapper.deleteByPrimaryKey(id);
    }
}

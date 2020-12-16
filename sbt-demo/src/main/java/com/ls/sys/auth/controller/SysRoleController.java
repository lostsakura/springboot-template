package com.ls.sys.auth.controller;

import com.ls.sys.auth.convert.SysRoleConvert;
import com.ls.sys.auth.domain.DO.SysRoleDO;
import com.ls.sys.auth.domain.VO.SysRoleVO;
import com.ls.sys.auth.service.SysRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sys/roles")
public class SysRoleController {

    @Resource
    private SysRoleService sysRoleService;

    private final SysRoleConvert sysRoleConvert = SysRoleConvert.INSTANCE;


    @GetMapping("/{id}")
    public SysRoleVO get(@PathVariable("id")Long id) {
        return sysRoleConvert.do2vo(sysRoleService.selectSysRoleDOById(id));
    }

    @GetMapping("")
    public List<SysRoleVO> list() {
        List<SysRoleDO> sysRoleDOList = sysRoleService.selectAllSysRoleDO();
        List<SysRoleVO> sysRoleVOList = new ArrayList<>();
        for (SysRoleDO sysRoleDO :sysRoleDOList) {
            sysRoleVOList.add(sysRoleConvert.do2vo(sysRoleDO));
        }
        return sysRoleVOList;
    }
}

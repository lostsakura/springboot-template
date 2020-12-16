package com.ls.sys.auth.controller;

import com.ls.sys.auth.convert.SysPrivilegeConvert;
import com.ls.sys.auth.domain.VO.SysPrivilegeVO;
import com.ls.sys.auth.service.SysPrivilegeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/sys/privileges")
public class SysPrivilegeController {

    @Resource
    private SysPrivilegeService sysPrivilegeService;

    private final SysPrivilegeConvert sysPrivilegeConvert = SysPrivilegeConvert.INSTANCE;


    @GetMapping("/{id}")
    public SysPrivilegeVO get(@PathVariable("id") Long id) {
        return sysPrivilegeConvert.do2vo(sysPrivilegeService.selectSysPrivilegeDOById(id));
    }

}

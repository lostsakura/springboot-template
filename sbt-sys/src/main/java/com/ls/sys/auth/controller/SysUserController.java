package com.ls.sys.auth.controller;

import com.ls.sys.auth.convert.SysUserConvert;
import com.ls.sys.auth.domain.DO.SysUserDO;
import com.ls.sys.auth.domain.VO.SysUserVO;
import com.ls.sys.auth.service.SysUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/sys/users")
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    private final SysUserConvert sysUserConvert = SysUserConvert.INSTANCE;


    @GetMapping("/{id}")
    public SysUserVO get(@PathVariable("id")Long id){
        SysUserDO sysUserDO = sysUserService.selectSysUserDOById(id);
        return sysUserConvert.do2vo(sysUserDO);
    }

    @GetMapping("")
    public List<SysUserVO> list(){
        List<SysUserDO> sysUserDOList = sysUserService.selectAllSysUserDO();
        List<SysUserVO> sysUserVOArrayList = new ArrayList<>();
        for(SysUserDO sysUserDO : sysUserDOList){
            sysUserVOArrayList.add(sysUserConvert.do2vo(sysUserDO));
        }
        return sysUserVOArrayList;
    }

}

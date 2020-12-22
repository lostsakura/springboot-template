package com.ls.sys.auth.convert;


import com.ls.sys.auth.domain.DO.SysUserDO;
import com.ls.sys.auth.domain.DTO.SysUserDTO;
import com.ls.sys.auth.domain.VO.SysUserVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SysUserConvert {

    SysUserConvert INSTANCE = Mappers.getMapper(SysUserConvert.class);

    @Mappings({
            @Mapping(source = "userName", target = "name"),
            @Mapping(source = "userPassword", target = "password"),
            @Mapping(source = "userEmail", target = "email"),
            @Mapping(source = "userInfo", target = "info"),
            @Mapping(source = "roleList", target = "roleList")
    })
    SysUserVO do2vo(SysUserDO sysUserDOWithBLOBs);

    @Mappings({
            @Mapping(source = "name", target = "userName"),
            @Mapping(source = "password", target = "userPassword"),
            @Mapping(source = "email", target = "userEmail"),
            @Mapping(source = "info", target = "userInfo"),
            @Mapping(source = "avatar", target = "userAvatar")
    })
    SysUserDO dto2do(SysUserDTO sysUserDTOw);
}

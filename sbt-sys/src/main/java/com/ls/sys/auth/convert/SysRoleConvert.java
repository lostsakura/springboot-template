package com.ls.sys.auth.convert;

import com.ls.sys.auth.domain.DO.SysRoleDO;
import com.ls.sys.auth.domain.VO.SysRoleVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SysRoleConvert {

    SysRoleConvert INSTANCE = Mappers.getMapper(SysRoleConvert.class);

    @Mappings({
            @Mapping(source = "roleName", target = "name"),
    })
    SysRoleVO do2vo(SysRoleDO sysRoleDO);
}

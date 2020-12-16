package com.ls.sys.auth.convert;

import com.ls.sys.auth.domain.DO.SysPrivilegeDO;
import com.ls.sys.auth.domain.VO.SysPrivilegeVO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper
public interface SysPrivilegeConvert {

    SysPrivilegeConvert INSTANCE = Mappers.getMapper(SysPrivilegeConvert.class);

    @Mappings({
            @Mapping(source = "privilegeName", target = "name"),
            @Mapping(source = "privilegeUrl", target = "url")
    })
    SysPrivilegeVO do2vo(SysPrivilegeDO sysPrivilegeDO);
}

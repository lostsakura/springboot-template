package com.ls.sys.auth.domain.DO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ls.sys.core.domain.BaseDO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
@JsonIgnoreProperties(value = { "handler"})
public class SysPrivilegeDO extends BaseDO {
    private Long id;

    private String privilegeName;

    private String privilegeUrl;

}
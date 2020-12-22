package com.ls.sys.auth.domain.VO;

import com.ls.sys.core.domain.BaseVO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@EqualsAndHashCode(callSuper = true)
@Data
@Accessors(chain = true)
public class SysPrivilegeVO extends BaseVO {
    private Long id;

    private String name;
    
    private String url;

}

package tk.mybatis.simple.model;

import lombok.Data;

/**
 * 描述
 *
 * @author lisiwei
 * 2019/8/10 10:13
 */
@Data
public class SysPrivilege {
    private Long id;

    private String privilegeName;

    private String privilegeUrl;

}

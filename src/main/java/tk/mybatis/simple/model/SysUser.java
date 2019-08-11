package tk.mybatis.simple.model;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SysUser {

    private Long id;

    private String userName;

    private String userPassword;

    private String userEmail;

    private String  userInfo;

    private byte[] headImg;

    private Date createTime;
    //private LocalTime createTime;
    private List<Long> ids;


}

package tk.mybatis.simple.mapper;

import tk.mybatis.simple.model.SysUser;

import java.util.List;
import java.util.Map;

/**
 * 描述
 *
 * @author lisiwei
 * 2019/8/10 10:59
 */
public interface UserMapper {

    List<SysUser> selectAll();

    List<Map<String,Long>> selectAllToMap();

    int addOne(SysUser sysUser);

    int addOneWithIdBack(SysUser sysUser);

    int addOneWithIdBackInSelectKey(SysUser sysUser);
}

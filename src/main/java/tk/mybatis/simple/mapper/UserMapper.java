package tk.mybatis.simple.mapper;

import org.apache.ibatis.annotations.Param;
import org.w3c.dom.ls.LSInput;
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

    List<SysUser> selectByIdOrUserName(SysUser sysUser);

    List<SysUser> selectByIds(@Param("ids") List<Long> ids);

    List<SysUser> selectByMap(Map<Object,Object> map);

    List<SysUser> selectByMap2(Map<Object,Object> map);

    List<SysUser> selectBySysUser(SysUser sysUser);

    List<SysUser> selectBy(@Param("user") SysUser sysUser);
}

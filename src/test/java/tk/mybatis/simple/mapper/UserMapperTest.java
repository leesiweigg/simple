package tk.mybatis.simple.mapper;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.model.SysUser;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 描述
 *
 * @author lisiwei
 * 2019/8/10 15:54
 */
@Slf4j
public class UserMapperTest extends BaseMapperTest{

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<SysUser> sysUsers = mapper.selectAll();
        sqlSession.close();
        System.out.println("sysUsers = " + sysUsers);
    }

    @Test
    public void testSelectAllToMap(){
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Map<String, Long>> maps = mapper.selectAllToMap();
        sqlSession.close();
        System.out.println("maps = " + maps);
    }

    @Test
    public void testAddOne(){
        SysUser sysUser = new SysUser();
        sysUser.setUserName("test1");
        sysUser.setUserEmail("test1@qq.com");
        sysUser.setUserPassword("123456");
        sysUser.setHeadImg(new byte[]{1,2,3});
        sysUser.setUserInfo("test info");
        sysUser.setCreateTime(new Date());
        System.out.println("sysUser = " + sysUser);
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addOne(sysUser);
        sqlSession.commit();
        System.out.println("i = " + i);
        sqlSession.close();

    }

    @Test
    public void testAddOneWithIdBack(){
        SysUser sysUser = new SysUser();
        sysUser.setUserName("test1");
        sysUser.setUserEmail("test1@qq.com");
        sysUser.setUserPassword("123456");
        sysUser.setHeadImg(new byte[]{1,2,3});
        sysUser.setUserInfo("test info");
        sysUser.setCreateTime(new Date());
        System.out.println("sysUser = " + sysUser);
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addOneWithIdBack(sysUser);
        System.out.println(sysUser);
        sqlSession.commit();
        System.out.println(sysUser);
        System.out.println("i = " + i);
        sqlSession.close();

    }

    @Test
    public void testAddOneWithIdBackInSelectKey(){
        SysUser sysUser = new SysUser();
        sysUser.setUserName("test1");
        sysUser.setUserEmail("test1@qq.com");
        sysUser.setUserPassword("123456");
        sysUser.setHeadImg(new byte[]{1,2,3});
        sysUser.setUserInfo("test info");
        sysUser.setCreateTime(new Date());
        System.out.println("sysUser = " + sysUser);
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int i = mapper.addOneWithIdBackInSelectKey(sysUser);
        System.out.println(sysUser);
        sqlSession.commit();
        System.out.println(sysUser);
        System.out.println("i = " + i);
        sqlSession.close();

    }
}

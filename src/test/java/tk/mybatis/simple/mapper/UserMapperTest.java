package tk.mybatis.simple.mapper;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.model.SysUser;

import java.util.*;

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
        log.info("SysUsers{}",sysUsers);
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
        //sysUser.setUserEmail("test1@qq.com");
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
        List<SysUser> sysUsers = mapper.selectAll();
        System.out.println("sysUsers = " + sysUsers);
        sqlSession.close();

    }

    @Test
    public void testSelectByIdOrUserName(){
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser sysUser = new SysUser();
        sysUser.setUserName("test1");
        List<SysUser> sysUsers = mapper.selectByIdOrUserName(sysUser);
        System.out.println("sysUsers = " + sysUsers);
        sqlSession.close();
    }

    @Test
    public void testSelectByIds(){
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Long> ids = new ArrayList<>(16);
        ids.add(1L);
        List<SysUser> sysUsers = mapper.selectByIds(ids);
        System.out.println("sysUsers = " + sysUsers);
        sqlSession.close();
    }

    @Test
    public void testSelectByMap(){
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<Object,Object> map = new HashMap<>(16);
        map.put("id","1");
        map.put("user_name","test");
        List<SysUser> sysUsers = mapper.selectByMap(map);
        System.out.println("sysUsers = " + sysUsers);
        sqlSession.close();
    }

    @Test
    public void testSelectByMap2(){
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<Object,Object> map = new HashMap<>(16);
        Map<Object,Object> query = new HashMap<>(16);
        query.put("id",1L);
        query.put("user_name","test");
        map.put("query",query);
        List<SysUser> sysUsers = mapper.selectByMap2(map);
        System.out.println("sysUsers = " + sysUsers);
        sqlSession.close();
    }

    @Test
    public void testSelectBySysUser(){
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser sysUser = new SysUser();
        List<Long> list = new ArrayList<>(16);
        list.add(1L);
        list.add(100L);
        sysUser.setIds(list);
        List<SysUser> sysUsers = mapper.selectBySysUser(sysUser);
        System.out.println("sysUsers = " + sysUsers);
        sqlSession.close();
    }

    @Test
    public void testSelectBy(){
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        SysUser sysUser = new SysUser();
        sysUser.setUserName("lala");
        mapper.selectBy(sysUser);
        sqlSession.close();
    }
}

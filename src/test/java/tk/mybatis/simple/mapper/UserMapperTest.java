package tk.mybatis.simple.mapper;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import tk.mybatis.simple.model.SysUser;

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
}

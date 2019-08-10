package tk.mybatis.simple.mapper;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.Reader;

/**
 * 描述
 *
 * @author lisiwei
 * 2019/8/10 15:49
 */
@Slf4j
public class BaseMapperTest {

    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try{
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        }catch (Exception e){
            log.error("创建sqlSessionFactory失败{}",e.getMessage());
        }
    }

    public SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
 }

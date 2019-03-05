import mybatis.Role;
import mybatis.RoleMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JavaBasicPrac {
    public static void main(String[] args) {
        SqlSessionFactory sqlSessionFactory = null;
        String resource = "mybatis-config.xml";
        InputStream inputStream;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSession sqlSession = null;
        if (sqlSessionFactory != null) {
            try {
                sqlSession = sqlSessionFactory.openSession();
                RoleMapper mapper = sqlSession.getMapper(RoleMapper.class);
                List<Role> roles = mapper.selectAll();
                for (Role role : roles) {
                    System.out.println(role);
                }
                sqlSession.commit();
            } catch (Exception e) {
                e.printStackTrace();
                sqlSession.rollback();
            } finally {
                if (sqlSession != null) {
                    sqlSession.close();
                }
            }
        }

    }
}
import mybatis.Role;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

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
                Role role = sqlSession.selectOne("mybatis.RoleMapper.selectByName", "dufu");
                System.out.println(role);
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
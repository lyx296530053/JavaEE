package cn.lyx.utiles;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        InputStream resourceAsStream = null;
        try {
            resourceAsStream = Resources.getResourceAsStream("mybatis.xml");
//          builder使用了构建者模式builder构建者resourcesAsStream钱，优势：屏蔽细节，直接调用方法拿到对象
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
//           使用了工厂模式：优势 解耦 降低类之间的依赖关系 不用new
//            SqlSession sqlSession = sqlSessionFactory.openSession();
//            代理模式
//            IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (resourceAsStream != null) {
                try {
                    resourceAsStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }
}

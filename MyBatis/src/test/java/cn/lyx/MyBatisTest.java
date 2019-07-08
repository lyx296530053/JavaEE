package cn.lyx;

import cn.lyx.dao.IUserDao;
import cn.lyx.daomain.User;
import cn.lyx.utiles.MybatisUtils;
import com.sun.xml.internal.ws.util.MetadataUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.util.List;


public class MyBatisTest {
    @Test
    public void testSaveUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        User user = new User();
        user.setUsername("lyx");
        user.setBirthday("1997-1-1");
        user.setSex("男");
        user.setAddress("陕西省西安市");
        mapper.saveUser(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void testFindAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void testUpdate(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IUserDao mapper = sqlSession.getMapper(IUserDao.class);
        User user = new User();
        user.setId(11);
        user.setUsername("lyy");
        user.setBirthday("1997-1-1");
        user.setSex("男");
        user.setAddress("陕西省西安市");
        mapper.upDate(user);
        sqlSession.commit();
        sqlSession.close();
    }
}

package cn.lyx;

import cn.lyx.dao.IAcountDao;
import cn.lyx.daomain.Account;
import cn.lyx.utiles.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class AccountTest {
    @Test
    public void testFindAll(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        IAcountDao mapper = sqlSession.getMapper(IAcountDao.class);
        List<Account> all = mapper.findAll();
        for (Account account : all) {
            System.out.println(all);
        }
    }
}

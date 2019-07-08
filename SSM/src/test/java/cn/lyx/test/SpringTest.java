package cn.lyx.test;

import cn.lyx.daomain.Account;
import cn.lyx.service.impl.AccountServiceImply;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class SpringTest {
    @Resource(name = "accountService")
    private AccountServiceImply accountServiceImply;
    @Test
    public void test1() {
        List<Account> all = accountServiceImply.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
    @Test
    public void test2() throws Exception {

    }
    @Test
    public void test3() throws Exception {
        Account account = new Account();
        account.setName("woai");
        account.setMoney(666f);
        accountServiceImply.saveAccount(account);
    }

    @Test
    public void test4() {
        List<Account> all = accountServiceImply.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}

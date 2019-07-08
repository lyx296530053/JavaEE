package cn.lyx.ServiceTest;

import cn.lyx.Service.IAccountService;
import cn.lyx.Service.Imply.AccountImplyAOPTest;
import cn.lyx.configure.AnnoationConfiguer1;
import cn.lyx.daomain.Account;
import cn.lyx.daomain.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = "classpath:bean.xml")
@ContextConfiguration(classes = AnnoationConfiguer1.class)
public class AccountTest {
 @Resource(name = "accountServiceImpl")
    private IAccountService as;


    @Test
    public void accountTest() {
        as.findAllAccount();
    }

    @Test
    public void aopTest() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        AccountImplyAOPTest aopTest = applicationContext.getBean("accountImplyAOPTest", AccountImplyAOPTest.class);
        System.out.println(aopTest.findAll());
    }

    @Test
    public void transfer() {
        as.transfer("aaa", "bbb", 100f);
    }

    @Test
    public void TestBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void test1() {
        Account accountById = as.findAccountById(3);
        System.out.println(accountById);
    }
}

package cn.lyx.ui;

import cn.lyx.Service.Imply.JdbcTempleSeriviceImply;
import cn.lyx.daomain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Cilent {
    public static void main(String[] args) {
            //立即加载
            //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
            // ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AnnoationConfiguer.class);
            // ApplicationContext applicationContext=new FileSystemXmlApplicationContext("Spring/src/main/resources/bean.xml");
            // IAccount accountService =  applicationContext.getBean("accountImply",IAccount.class);
            //List<Account> all = accountService.findAll();
            // System.out.println(all);
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        JdbcTempleSeriviceImply jdbcTemplateServiceImply = applicationContext.getBean("jdbcTemplateServiceImply", JdbcTempleSeriviceImply.class);
//        List<Account> all = jdbcTemplateServiceImply.findAll();
//        System.out.println(all);
//        IAccountDao accountDao = applicationContext.getBean("accountDao", IAccountDao.class);
//        System.out.println(accountService);
//        System.out.println(accountDao);
        //延迟加载
//        Resource resource = new ClassPathResource("bean.xml");
//        BeanFactory beanFactory=new XmlBeanFactory(resource);
//        IAccount accountService = (IAccount) beanFactory.getBean("accountService");
//        System.out.println(accountService);
    }
}

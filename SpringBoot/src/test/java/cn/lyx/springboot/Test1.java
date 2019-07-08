package cn.lyx.springboot;

import cn.lyx.springboot.daomain.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
    @Resource(name = "person")
    Person person;
    @Test
    public void test1(){
        System.out.println(person);
    }
}

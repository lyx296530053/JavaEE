package cn.lyx.configure;

import org.springframework.context.annotation.*;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= "cn.lyx")
@Import({JdbcConfigure.class})
@EnableTransactionManagement
//@EnableAspectJAutoProxy
public class AnnoationConfiguer1 {
    @Configuration
    @PropertySource("classpath:druid.properties")
    public class JdbcConfigure{}
}

package cn.lyx.configure;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class JdbcConfigure {
    @Value("${jdbcUrl}")
    private String url;
    @Value("${driverClass}")
    private String driverClass;
    @Value("${user}")
    private String user;
    @Value("${password}")
    private String password;
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate=new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }
    @Bean
    public DataSource dataSource(){
        ComboPooledDataSource dataSource=new ComboPooledDataSource();
        dataSource.setJdbcUrl(url);
        try {
            dataSource.setDriverClass(driverClass);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        dataSource.setUser(user);
        dataSource.setPassword(password);
        return dataSource;
    }
}

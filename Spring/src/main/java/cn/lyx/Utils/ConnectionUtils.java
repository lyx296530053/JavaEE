package cn.lyx.Utils;

import org.springframework.stereotype.Component;


import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Component("connectionUtils")
public class ConnectionUtils {
    private ThreadLocal<Connection> threadLocal=new ThreadLocal<>();
    @Resource(name = "dataSource")
    private DataSource dataSource;

//   public void setDataSource(DataSource dataSource) {
//        this.dataSource = dataSource;
//    }

    public Connection getConnection(){
        Connection connection = threadLocal.get();
        if(connection==null){
            try {
                connection = dataSource.getConnection();
                threadLocal.set(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}

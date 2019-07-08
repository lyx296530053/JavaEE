package cn.lyx.Utils;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.SQLException;
//@Component
//@Aspect
public class Manager {
   @Resource(name = "connectionUtils")
    private  ConnectionUtils connectionUtils;

//    public void setConnectionUtils(ConnectionUtils connectionUtils) {
//        this.connectionUtils = connectionUtils;
//    }
//@Before("execution(* cn.lyx.Service.Imply.*.*(..))")
    public void beginTransaction(){
        try {
            connectionUtils.getConnection().setAutoCommit(false);
            System.out.println("关闭自动提交");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
   // @AfterReturning("execution(* cn.lyx.Service.Imply.*.*(..))")
    public void commit(){
        try {
            connectionUtils.getConnection().commit();
            System.out.println("提交");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //@AfterThrowing("execution(* cn.lyx.Service.Imply.*.*(..))")
    public void rollback(){
        try {
            connectionUtils.getConnection().rollback();
            System.out.println("回滚");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    //@After("execution(* cn.lyx.Service.Imply.*.*(..))")
    public void relese(){
        try {
            connectionUtils.getConnection().close();
            System.out.println("释放资源");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Around("execution(* cn.lyx.Service.Imply.*.*(..))")
    public void around(ProceedingJoinPoint pjp){
        Object rtValue = null;
        try {
            Object[] args = pjp.getArgs();
            beginTransaction();
            rtValue = pjp.proceed(args);
            commit();
        }catch(Throwable e) {
            rollback();
            e.printStackTrace();
        }finally {
            relese();
        }
    }
}

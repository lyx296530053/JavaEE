package cn.lyx.factory;

import cn.lyx.Service.IAccount;
import cn.lyx.Service.IAccountService;
import cn.lyx.Utils.Manager;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
//@Component
public class BeanFactory {
    private IAccountService account;

    private Manager manager;

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public final void setAccount(IAccountService account) {
        this.account = account;
    }

    public IAccountService agetIAccount() {
        return (IAccountService) Proxy.newProxyInstance(account.getClass().getClassLoader(), account.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object invoke = null;
                try {
                    manager.beginTransaction();
                    invoke = method.invoke(account, args);
                    manager.commit();
                    return invoke;
                } catch (Exception e) {
                    manager.rollback();
                    throw  new RuntimeException(e);
                } finally {
                    manager.relese();
                }
            }
        });
    }
}

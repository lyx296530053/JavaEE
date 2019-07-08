package cn.lyx.Service.Imply;

import cn.lyx.Service.IAccount;
import cn.lyx.daomain.Account;

import java.util.List;
import java.util.Map;

public class AccountImplyAOPTest implements IAccount {
    @Override
    public List<Map<String, Object>> findAll() {
        System.out.println("findall执行了。。。");
        return null;
    }

    @Override
    public Account findById(Integer id) {
        return null;
    }

    @Override
    public void saveAccount(Account account) {

    }

    @Override
    public void updateAccount(Account account) {

    }

    @Override
    public void deleteAccount(Integer id) {

    }
}

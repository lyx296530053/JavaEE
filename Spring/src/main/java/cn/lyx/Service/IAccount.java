package cn.lyx.Service;

import cn.lyx.daomain.Account;

import java.util.List;
import java.util.Map;

public interface IAccount {
    List<Map<String, Object>> findAll();
    Account findById(Integer id);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Integer id);
}

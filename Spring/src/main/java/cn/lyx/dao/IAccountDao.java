package cn.lyx.dao;

import cn.lyx.daomain.Account;

import java.util.List;
import java.util.Map;

public interface IAccountDao {
    List<Map<String, Object>> findAll();
    Account findAccountById(Integer id);
    Account findAccountByName(String name);
    void saveAccount(Account account);
    void updateAccount(Account account);
    void deleteAccount(Integer id);
}

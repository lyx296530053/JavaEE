package cn.lyx.service;

import cn.lyx.daomain.Account;

import java.util.List;

public interface AccountService {
    public List<Account> findAll();
    public void saveAccount(Account account);
}

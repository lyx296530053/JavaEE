package cn.lyx.service.impl;

import cn.lyx.dao.AccountDao;
import cn.lyx.daomain.Account;
import cn.lyx.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImply implements AccountService {
   @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();

    }

    @Override
    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }
}

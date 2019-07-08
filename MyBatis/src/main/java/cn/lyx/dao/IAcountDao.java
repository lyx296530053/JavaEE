package cn.lyx.dao;

import cn.lyx.daomain.Account;

import java.util.List;

public interface IAcountDao {
    List<Account> findAll();
}

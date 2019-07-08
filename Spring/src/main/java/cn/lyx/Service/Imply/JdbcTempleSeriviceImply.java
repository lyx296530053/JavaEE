package cn.lyx.Service.Imply;

import cn.lyx.Service.IAccount;
import cn.lyx.dao.IAccountDao;
import cn.lyx.daomain.Account;

import java.util.List;
import java.util.Map;

public class JdbcTempleSeriviceImply implements IAccount {
    private IAccountDao iAccountDao;

    public void setiAccountDao(IAccountDao iAccountDao) {
        this.iAccountDao = iAccountDao;
    }

    @Override
    public List<Map<String, Object>> findAll() {
       return iAccountDao.findAll();
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

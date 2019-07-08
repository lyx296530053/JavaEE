package cn.lyx.Service.Imply;

import cn.lyx.Service.IAccount;
import cn.lyx.Service.IAccountService;
import cn.lyx.dao.IAccountDao;
import cn.lyx.daomain.Account;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

//@Service
public class AccountImply  implements IAccountService {
//@Resource(name = "accountDaoImply")
    private IAccountDao iAccountDao;
    public void setiAccountDao(IAccountDao iAccountDao) {
        this.iAccountDao = iAccountDao;
    }



    @Override
    public List<Account> findAllAccount() {
        return null;
    }

    @Override
    public Account findAccountById(Integer accountId) {
        return iAccountDao.findAccountById(accountId);
    }

    @Override
    public void saveAccount(Account account) {
iAccountDao.saveAccount(account);
    }

    @Override
    public void updateAccount(Account account) {
iAccountDao.updateAccount(account);
    }

    @Override
    public void deleteAccount(Integer id) {

    }

    @Override
    public void transfer(String sourceName, String targetName, Float money) {

    }
}

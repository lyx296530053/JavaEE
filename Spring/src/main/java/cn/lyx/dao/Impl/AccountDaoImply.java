package cn.lyx.dao.Impl;

import cn.lyx.dao.IAccountDao;
import cn.lyx.daomain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Repository
public class AccountDaoImply implements IAccountDao {
    //@Autowired
    //@Qualifier
//    @Resource(name = "runner")
//  private QueryRunner runner;

//    public void setRunner(QueryRunner runner) {
//        this.runner = runner;
//    }
   // @Resource(name = "jdbcTemplate")
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public List<Map<String, Object>> findAll() {
        List<Map<String, Object>> query = null;
        try {
            query = jdbcTemplate.queryForList("select * from Account", new BeanPropertyRowMapper<>(Account.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return query;
    }


    @Override
    public Account findAccountByName(String name) {
        return jdbcTemplate.queryForObject("select * from Account where name=?", new BeanPropertyRowMapper<>(Account.class), name);
    }

    @Override
    public Account findAccountById(Integer id) {
        Account account =jdbcTemplate.queryForObject("select * from Account where id=?", new BeanPropertyRowMapper<>(Account.class), id);
        return account;
    }

    @Override
    public void saveAccount(Account account) {
       jdbcTemplate.update("insert  into Account(name ,money) values (?,?)", account.getName(), account.getMoney());
    }

    @Override
    public void updateAccount(Account account) {
        jdbcTemplate.update("update Account set money=? where name =?", account.getMoney(),account.getName());
    }

    @Override
    public void deleteAccount(Integer id) {

    }
}

package cn.lyx.dao.Impl;

import cn.lyx.dao.IAccountDao;
import cn.lyx.daomain.Account;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class JdbcTemplateImply implements IAccountDao {
//    private JdbcTemplate jdbcTemplate;
//
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public List<Map<String, Object>> findAll() {
      return null;
    }

    @Override
    public Account findAccountById(Integer id) {
        return null;
    }

    @Override
    public Account findAccountByName(String name) {
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

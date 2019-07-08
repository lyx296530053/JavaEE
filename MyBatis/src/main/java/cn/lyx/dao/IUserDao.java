package cn.lyx.dao;

import cn.lyx.daomain.User;
import org.apache.ibatis.annotations.Select;


import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();
    void saveUser(User user);
    void del(int i);
    void upDate(User user);
}

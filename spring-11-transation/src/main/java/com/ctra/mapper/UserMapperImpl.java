package com.ctra.mapper;

import com.ctra.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    public List<User> getUserList() {
        User user = new User("zhangsan", 22, "dsa");
        addUser(user);
        deleteUser(2);

        return getSqlSession().getMapper(UserMapper.class).getUserList();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}

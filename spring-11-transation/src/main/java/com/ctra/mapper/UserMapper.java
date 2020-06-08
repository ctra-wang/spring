package com.ctra.mapper;

import com.ctra.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> getUserList();

    public int addUser(User user);

    public int deleteUser(int id);
}

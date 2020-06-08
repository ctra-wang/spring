package com.ctra.service;

import com.ctra.dao.UserDao;
import com.ctra.dao.UserDaoImpl;
import com.ctra.dao.UserDaoMysqlImpl;
import com.ctra.dao.UserDaoOracleImpl;

import javax.jws.soap.SOAPBinding;

public class UserServiceImpl implements UserService {
    UserDao userdao1 = new UserDaoImpl();
    UserDao userdao2 = new UserDaoMysqlImpl();
    UserDao userdao3 = new UserDaoOracleImpl();

    private UserDao userDao;
    // 利用set进行动态实现 的注入
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    public void getUser() {
        // 业务层 service 调用 dao 层
        userDao.getUser();
    }

}

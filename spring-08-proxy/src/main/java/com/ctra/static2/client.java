package com.ctra.static2;

public class client {
    public static void main(String[] args) {
        // 被代理类
        UserServiceImpl userService = new UserServiceImpl();

        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userService);

        userServiceProxy.add();


    }
}

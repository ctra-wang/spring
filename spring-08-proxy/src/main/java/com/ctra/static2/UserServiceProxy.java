package com.ctra.static2;

public class UserServiceProxy implements UserService{
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }


    public void add() {
        log();
        userService.add(); // 实现原先的方法
    }

    public void delete() {
        log();
        userService.delete(); // 实现原先的方法
    }

    public void update() {
        log();
        userService.delete(); // 实现原先的方法
    }

    public void query() {
        log();
        userService.delete(); // 实现原先的方法
    }

    void log(){
        System.out.println("增加日志功能");
    }
}

package com.ctra.pojo;

public class UserT {
    private  String name;

    // 无参构造
    public UserT(){
        System.out.println("UserT类进行初始化");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String show() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

}

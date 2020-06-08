package com.ctra.pojo;

public class User {
    private  String name;

    // 无参构造
//    public User(){
//        System.out.println("User类进行初始化");
//    }

    public User(String name){
        this.name=name;
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

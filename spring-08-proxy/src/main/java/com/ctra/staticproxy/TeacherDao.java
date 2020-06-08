package com.ctra.staticproxy;

// 被代理的类
public class TeacherDao implements ITeacherDao {

    public void teach() {
        System.out.println("老师授课中");
    }
}

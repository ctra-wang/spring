package com.ctra.staticproxy;

public class Test {
    public static void main(String[] args) {
        // 被代理对象
        TeacherDao teacherDao = new TeacherDao();

        // 代理
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        // 通过代理对象，调用到被代理对象的方法
        teacherDaoProxy.teach();
    }
}

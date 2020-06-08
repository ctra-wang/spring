package com.ctra.dynamic;

public class Client {

    public static void main(String[] args) {
        // 真实角色
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        // 代理角色  被创建的
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(teacherDao);

        //动态生成代理类
        TeacherDao  proxy = (TeacherDao) proxyInvocationHandler.getProxy();
        proxy.teach();

    }
}

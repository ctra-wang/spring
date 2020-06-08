package com.ctra.dynamic2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    // 被代理的 接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成代理类 根据传入的接口
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    // 处理代理实例，并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 动态代理的本质，就是使用反射机制实现
        log();
        Object result = method.invoke(target, args);
        return result;
    }

    void log(){
        System.out.println("日志功能");
    }
}

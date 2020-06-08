package com.ctra.log;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.annotation.Target;
import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    /*
    * method：要执行的目标对象的方法
    * args：参数
    * target：目标对象
    * */
    public void before(Method method, Object[] objects, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName()+"被指行了");
    }
}

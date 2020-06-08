package com.ctra.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;

@Aspect // 标注这个类是一个切面
public class AnnotationPointCut  {
    @Before("execution(* com.ctra.service.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("====执行后====");
    }
    @After("execution(* com.ctra.service.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("====执行后====");
    }

    @AfterReturning("execution(* com.ctra.service.UserServiceImpl.*(..))")
    public void afterReturn(){
        System.out.println("====执行 afterReturn 后====");
    }

    @Around("execution(* com.ctra.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature(); // 获取签名
        System.out.println(signature);
        Object proceed = jp.proceed(); // 执行方法
        System.out.println("环绕hou");
    }
}

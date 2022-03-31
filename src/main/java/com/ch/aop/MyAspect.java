package com.ch.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    @Before("pointcut()")
    public void before(){
        System.out.println("前置增强。。");
    }

    @Pointcut("execution(* com.ch.aop.*.*(..))")
    public void pointcut(){}
}

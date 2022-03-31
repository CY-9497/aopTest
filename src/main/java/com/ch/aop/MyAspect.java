package com.ch.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAspect")
@Aspect
public class MyAspect {

    @Before("execution(* com.ch.aop.Target.*(..))")
    public void before(){
        System.out.println("前置增强。。");
    }
}

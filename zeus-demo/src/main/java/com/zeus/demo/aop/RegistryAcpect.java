package com.zeus.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Aspect
//@Component
public class RegistryAcpect {
    //切点表达式意义自行百度 注意,指定到方法和指定类下所有方法  这两种情况的表达式不同
    @Pointcut("@annotation(com.antzuhl.zeus.server.ZeusRegistry)")
    public void token(){
        System.out.println("1");
    }

    //目标方法执行完后执行
    @After("token()")
    public void doAfter(){
        System.out.println("1.....");
    }

}

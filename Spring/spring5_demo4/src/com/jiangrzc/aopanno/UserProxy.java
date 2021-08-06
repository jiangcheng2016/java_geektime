package com.jiangrzc.aopanno;

//增强类

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.jiangrzc.aopanno.User.add(..) )")
    public void pointDemo(){

    }

    //创建增强方法

    //1.前置通知
    @Before(value = "pointDemo()")
    public void before(){
        System.out.println("before......");
    }

    //
    @After(value = "execution(* com.jiangrzc.aopanno.User.add(..) )")
    public void after(){
        System.out.println("after..........");
    }

    //
    @AfterReturning(value = "execution(* com.jiangrzc.aopanno.User.add(..) )")
    public void afterReturning(){
        System.out.println("AfterReturning.........");
    }

    //
    @Around(value = "execution(* com.jiangrzc.aopanno.User.add(..) )")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前.........");
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后.........");
    }

    //
    @AfterThrowing(value = "execution(* com.jiangrzc.aopanno.User.add(..) )")
    public void afterThrowing(){
        System.out.println("afterThrowing。。。。。。。");
    }

}

package com.jiangrzc.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)   //设置优先级，数值越小优先级越高
public class PersonPorxy {

    @Before(value = "execution(* com.jiangrzc.aopanno.User.add(..))")
    public void Before(){
        System.out.println("PersonProxy Before........");
    }
}

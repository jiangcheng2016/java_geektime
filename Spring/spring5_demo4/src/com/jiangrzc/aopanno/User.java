package com.jiangrzc.aopanno;

//被增强类(编写增强逻辑)

import org.springframework.stereotype.Component;

@Component
public class User {

    public void add(){
        System.out.println("addd......");
    }
}

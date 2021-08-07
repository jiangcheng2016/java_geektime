package com.jiangrzc.test;

import com.jiangrzc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testTransaction {

    @Test
    public void testTX(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);

        userService.account();
    }

}

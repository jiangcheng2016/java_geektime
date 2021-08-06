package com.jiangrzc.test;

import com.jiangrzc.config.SpringConfig;
import com.jiangrzc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {


    @Test
    public void testService(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        UserService userService =  context.getBean("userService", UserService.class);

        System.out.println(userService);

        userService.show();

    }

    @Test
    public void testService2(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        UserService userService =  context.getBean("userService", UserService.class);

        System.out.println(userService);

        userService.show();

    }
}

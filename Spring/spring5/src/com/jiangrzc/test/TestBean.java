package com.jiangrzc.test;

import com.jiangrzc.Book;
import com.jiangrzc.bean.Emp;
import com.jiangrzc.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testBean1(){

        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置创建的对象
        UserService userService = context.getBean("userService", UserService.class);

        System.out.println(userService);

        userService.add();
    }

    @Test
    public void testBeaan2(){

        //1.加载spring的配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取配置创建的对象
        Emp emp = context.getBean("emp", Emp.class);

        System.out.println(emp);

        emp.show();
    }
}

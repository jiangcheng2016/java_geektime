package com.jiangrzc.test;

import com.jiangrzc.aopXml.Book;
import com.jiangrzc.aopanno.User;
import com.jiangrzc.config.Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAop {

    @Test
    public void testAopp(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);

        user.add();
    }

    @Test
    public void testAopp2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book",Book.class);

        book.buyBook();
    }

    @Test
    public void testAopp3(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        User user = context.getBean("user",User.class);
        user.add();
    }
}

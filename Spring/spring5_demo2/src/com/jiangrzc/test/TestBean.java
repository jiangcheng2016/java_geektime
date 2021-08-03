package com.jiangrzc.test;

import com.jiangrzc.collectionType.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testBean(){

        //1.获取spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Stu stu = context.getBean("stu", Stu.class);

        //操作
        System.out.println(stu);

        stu.show();
    }
}

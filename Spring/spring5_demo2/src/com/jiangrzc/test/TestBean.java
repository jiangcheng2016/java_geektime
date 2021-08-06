package com.jiangrzc.test;

import com.jiangrzc.autowried.Emp;
import com.jiangrzc.bean.Orders;
import com.jiangrzc.collectionType.Book;
import com.jiangrzc.collectionType.Course;
import com.jiangrzc.collectionType.Stu;
import com.jiangrzc.factoryBean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testBean1(){

        //1.获取spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        //2.获取配置创建的对象
        Stu stu = context.getBean("stu", Stu.class);

        //操作
        System.out.println(stu);

        stu.show();
    }

    @Test
    public void testBean2(){

        //1.获取spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        //2.获取配置创建的对象
        Book book1 = context.getBean("book", Book.class);

        //测试单实例和多实例
        Book book2 = context.getBean("book", Book.class);
        //操作
        System.out.println(book1);

        System.out.println(book2);

       // book.show();

    }


    @Test
    public void testBean3(){

        //1.获取spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");

        //2.获取配置创建的对象
//        MyBean myBean = context.getBean("myBean", MyBean.class);
        Course course = context .getBean("myBean", Course.class);

        //操作
        System.out.println(course);


    }

    @Test
    public void testBean4(){

        //1.获取spring配置文件
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");

        //2.获取配置创建的对象
        Orders orders = context.getBean("orders",Orders.class);
        System.out.println("bean的生命周期第六步：bean 可以用了(获取到对象了)");

        //操作
        System.out.println(orders);

        //手动让容器销毁
        //((ClassPathXmlApplicationContext)context).close();  //因为获取Spring配置文件的时候用的是ApplicationContext，所以要进行强制转换
        //如果获取Spring配置文件的时候用的是 ClassPathXmlApplicationContext,则可直接使用 close();
        context.close();


    }

    @Test
    public void testBean5(){

        //1.获取spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");

        //2.获取配置创建的对象
        Emp emp = context .getBean("emp", Emp.class);

        //操作
        System.out.println(emp);


    }
}

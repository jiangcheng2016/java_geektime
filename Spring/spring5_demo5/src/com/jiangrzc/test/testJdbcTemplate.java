package com.jiangrzc.test;

import com.jiangrzc.entity.Book;
import com.jiangrzc.service.BookService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class testJdbcTemplate {

    @Test
    public void testJdbcTemplate(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        //新增一条记录
//        Book book = new Book();
//        book.setBid("003");
//        book.setBname("六脉神剑");
//        book.setBstatu("60");
//        bookService.add(book);

        //更新一条记录
//        Book book = new Book();
//        book.setBid("001");
//        book.setBname("九阳真经2");
//        book.setBstatu("40");
//        bookService.update(book);

        //删除一条记录
//        String id = "1";
//        int res = bookService.delete(id);
//        if(res == 1)
//            System.out.println("删除成功");
//        else
//            System.out.println("删除失败");

        //查询一条记录
//        String id = "3";
//        Book book = bookService.findOne(id);
//        System.out.println(book);

        //查询记录数量
//        int countbook = bookService.countBook();
//        System.out.println("数据库中共有" + countbook + "条记录");

        //查询多条记录
//        List<Book> bookList = bookService.findAll();
//        System.out.println(bookList);

        //批量增加
//        List<Object[]> objs = new ArrayList<>();
//        Object[] obj1 = {"7","独孤九剑2","70"};
//        Object[] obj2 = {"8","天龙八部2","80"};
//        Object[] obj3 = {"9", "倚天屠龙记2","90"};
//
//        objs.add(obj1);
//        objs.add(obj2);
//        objs.add(obj3);
//
//        bookService.batchAddBooks(objs);


        //批量修改
        List<Object[]> objs = new ArrayList<>();
        Object[] obj1 = {"独孤九剑222","70","4",};
        Object[] obj2 = {"天龙八部222","80","2"};
        Object[] obj3 = {"955", "倚天屠龙记222","3"};

        objs.add(obj1);
        objs.add(obj2);
        objs.add(obj3);

        bookService.batchUpdateBooks(objs);

        //批量删除
//        List<Object[]> ids = new ArrayList<>();
//        Object[] id1 = {"7"};
//        Object[] id2 = {"8"};
//        Object[] id3 = {"9"};
//
//        ids.add(id1);
//        ids.add(id2);
//        ids.add(id3);
//
//        bookService.batchDeleteBooks(ids);
    }

}

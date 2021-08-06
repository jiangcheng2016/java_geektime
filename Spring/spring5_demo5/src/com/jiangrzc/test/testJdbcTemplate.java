package com.jiangrzc.test;

import com.jiangrzc.entity.Book;
import com.jiangrzc.service.BookService;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testJdbcTemplate {

    @Test
    public void testJdbcTemplate(){

        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");

        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setBid("001");
        book.setBname("九阳真经");
        book.setBstatu("30");

        bookService.add(book);
    }

}

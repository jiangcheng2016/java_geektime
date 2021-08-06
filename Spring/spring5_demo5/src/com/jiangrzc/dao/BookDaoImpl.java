package com.jiangrzc.dao;

import com.jiangrzc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {
        //完成插入操作
        String sql = "insert into t_book value(?,?,?)";
        Object[] params = {book.getBid(),book.getBname(),book.getBstatu()};
        int res = jdbcTemplate.update(sql, params);
        if(res == 1)
            System.out.println("添加成功!");
        else
            System.out.println("添加失败!");
    }
}

package com.jiangrzc.dao;

import com.jiangrzc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;


@Repository
public class BookDaoImpl implements BookDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {
        //完成插入操作
        String sql = "insert into t_book value(?,?,?)";
        Object[] params = {book.getB_id(),book.getB_name(),book.getB_statu()};
        int res = jdbcTemplate.update(sql, params);
        if(res == 1)
            System.out.println("添加成功!");
        else
            System.out.println("添加失败!");
    }

    //更新一条记录
    @Override
    public void update(Book book) {
        String sql = "update t_book set b_name = ?,b_statu = ? where b_id = ?";
        Object[] params = {book.getB_name(),book.getB_statu(),book.getB_id()};
        int res = jdbcTemplate.update(sql, params);
        if(res == 1)
            System.out.println("更新成功");
        else
            System.out.println("更新失败");
    }

    //删除一条记录
    @Override
    public int delete(String id) {
        String sql = "delete from t_book where b_id = ?";
        Object[] params = {id};
        int res = jdbcTemplate.update(sql, params);
        return res;
    }

    //查询一条记录
    @Override
    public Book findOne(String id) {
        String sql = "select * from t_book where b_id = ?";
        //Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Book.class), id);
        return book;
    }

    //查询记录数量
    @Override
    public int countBook() {
        String sql = "select count(*) from t_book";
        Integer res = jdbcTemplate.queryForObject(sql, Integer.class);
        return res;
    }

    //查询多条记录
    @Override
    public List<Book> findAll() {
        String sql = "select * from t_book";
        List<Book> bookList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Book.class));
        return bookList;
    }

    //批量增加
    @Override
    public void batchAddBooks(List<Object[]> objs) {
        String sql = "insert into t_book value(?,?,?)";
        int[] res = jdbcTemplate.batchUpdate(sql, objs);
        System.out.println(Arrays.toString(res));
    }

    //批量删除
    @Override
    public void batchDelete(List<Object[]> ids) {
        String sql = "delete from t_book where b_id = ?";
        int[] res = jdbcTemplate.batchUpdate(sql, ids);
        System.out.println(Arrays.toString(res));

    }

    //批量修改
    @Override
    public void batchUpdate(List<Object[]> objs) {
        String sql = "update t_book set b_name = ?,b_statu = ? where b_id = ?";
        int[] res = jdbcTemplate.batchUpdate(sql, objs);
        System.out.println(Arrays.toString(res));
    }
}

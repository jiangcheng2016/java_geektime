package com.jiangrzc.service;

import com.jiangrzc.dao.BookDao;
import com.jiangrzc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    //添加一条记录
    public void add(Book book){
        bookDao.add(book);
    }

    //更新一条记录
    public void update(Book book){
        bookDao.update(book);
    }

    //删除一条记录
    public int delete(String id){
        return bookDao.delete(id);
    }

    //查询一条记录
    public Book findOne(String id){
        return bookDao.findOne(id);
    }

    //查询记录数量
    public int countBook(){
        return bookDao.countBook();
    }

    //查询多条记录
    public List<Book> findAll(){
        return bookDao.findAll();
    }

    //批量增加
    public void batchAddBooks(List<Object[]> objs){
        bookDao.batchAddBooks(objs);
    }


    //批量删除
    public void batchDeleteBooks(List<Object[]> ids){
        bookDao.batchDelete(ids);
    }

    //批量修改
    public void batchUpdateBooks(List<Object[]> objs){
        bookDao.batchUpdate(objs);
    }
}

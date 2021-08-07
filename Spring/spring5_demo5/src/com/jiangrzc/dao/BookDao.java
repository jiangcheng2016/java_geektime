package com.jiangrzc.dao;

import com.jiangrzc.entity.Book;

import java.util.List;

public interface BookDao {

   public void add(Book book);

   //更新一条记录
   void update(Book book);

   //删除一条记录
   int delete(String id);


   //查询一条记录
   Book findOne(String id);

   //查询记录数量
   int countBook();

   //查询多条记录
   List<Book> findAll();

   //批量增加
   void batchAddBooks(List<Object[]> objs);
   //批量删除
   void batchDelete(List<Object[]> ids);

   //批量修改
   void batchUpdate(List<Object[]> objs);
}

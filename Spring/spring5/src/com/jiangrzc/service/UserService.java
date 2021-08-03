package com.jiangrzc.service;

import com.jiangrzc.dao.UserDao;

public class UserService {

    //创建 UserDao 类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(){
        System.out.println("UserService add......");
        userDao.update();

    }
}

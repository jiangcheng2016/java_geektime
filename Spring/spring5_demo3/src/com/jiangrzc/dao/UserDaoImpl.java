package com.jiangrzc.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{

    @Override
    public void show() {
        System.out.println("UserDaoImpl show.....");
    }
}

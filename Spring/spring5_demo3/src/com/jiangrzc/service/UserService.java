package com.jiangrzc.service;

import com.jiangrzc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

//@Component(value = "userService")   //<bean id="userService" class=".."></bean> 一样
//在注解里面 value 属性值可以省略不写，默认值是类名首字母小写  UserService -> userService
@Service
public class UserService {

    @Value(value = "abc1233")
    private String name;

//    @Autowired
//    @Qualifier(value = "userDaoImpl1")
    @Resource(name = "userDaoImpl1")
    private UserDao userDao;

    public void show(){
        System.out.println("UserService show ...." + name);
        userDao.show();
    }
}

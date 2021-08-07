package com.jiangrzc.service;

import com.jiangrzc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {

    //
    @Autowired
    private UserDao userDao;

    /**
     * 使用事务解决这种因异常导致的不一致性问题
     *
     * 第一步：开启事务
     * 第二步：进行业务操作
     * 第三步：没有发生异常，提交事务
     * 第四步：出现异常，事务回滚
     *
     *
     *
     * 事务的管理有两种：
     * 1.编程式事务管理(不推荐使用)
     * 2.声明式事务管理(推荐使用)
     *      声明式事务管理有两种：
     *            1.基于注解(推荐使用)
     *            2.xml文件配置(不推荐使用)
     *
     *
     */


    //转钱的方法
    @Transactional
    public void account(){

        //编程式解决，例如 try catch

        //try{
            //lucy 减100元
            userDao.subMoney();

            //模拟异常
            int i = 10/0;

            //mary 增加100元
            userDao.addMoney();

            //第三步：如果正常执行，提交事务
        //}catch (Exception e){
            //第四步：出现异常，事务回滚
        //}


    }

}

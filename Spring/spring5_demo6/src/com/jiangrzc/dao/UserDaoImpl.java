package com.jiangrzc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void subMoney() {
        String sql = "update t_account set a_money = a_money - 100 where a_name = ?";
        int res = jdbcTemplate.update(sql, "lucy");
        if(res == 1)
            System.out.println("lucy减掉100元成功");
        else
            System.out.println("lucy减掉100元失败");
    }

    @Override
    public void addMoney() {
        String sql = "update t_account set a_money = a_money + 100 where a_name = ?";
        int res = jdbcTemplate.update(sql, "mary");
        if(res == 1)
            System.out.println("mary减掉100元成功");
        else
            System.out.println("mary减掉100元失败");

    }
}

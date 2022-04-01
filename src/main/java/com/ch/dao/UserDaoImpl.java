package com.ch.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

@Repository("userDao")
public class UserDaoImpl implements UserDao{
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;
    public void transferOut(String username, Double m) {
        jdbcTemplate.update("update user set money =money - ? where username = ?",m,username);
    }
    public void transferIn(String username, Double m){
        jdbcTemplate.update("update user set money =money + ? where username = ?",m,username);
    }


}

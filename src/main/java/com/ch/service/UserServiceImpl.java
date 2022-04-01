package com.ch.service;

import com.ch.dao.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource(name = "userDao")
    private UserDao userDao;


    @Override
    public void transfer(String username1,String username2, Double m) {
        userDao.transferOut(username1,m);
//        int i = 1/0;
        userDao.transferIn(username2,m);
    }


}

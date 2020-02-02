package com.sincere.Demo.service;

import com.sincere.Demo.dao.UserDao;
import com.sincere.Demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, password);
        System.out.println("user in userService  impl : " + username + " " + password);
        System.out.println(user);
        return user;
    }

    @Override
    public void insert(String username, String password) {
        userDao.adding(username, password);
        System.out.println("user in userService  impl : " + username + " " + password);


    }


}
package com.sincere.Demo.dao;


import com.sincere.Demo.model.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface UserDao {
    User findByUsernameAndPassword(String username, String password);

    void adding(String username, String password);
}
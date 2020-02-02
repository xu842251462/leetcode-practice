package com.sincere.Demo.service;

import com.sincere.Demo.model.User;

public interface UserService {
    User checkUser(String username, String password);

    void insert(String username, String password);
}
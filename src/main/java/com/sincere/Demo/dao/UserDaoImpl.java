package com.sincere.Demo.dao;

import com.sincere.Demo.mapper.UserMapper;
import com.sincere.Demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User findByUsernameAndPassword(String username, String password) {
        String sql = String.format("select * from user where username='%s' and password ='%s'", username, password);
        RowMapper mapper = new UserMapper();
        try {
            User user = (User) jdbcTemplate.queryForObject(sql, mapper);
            System.out.println("sql in daoimpl " + sql);
            return user;
        } catch (EmptyResultDataAccessException e) {
            return null;
        }

    }

    @Override
    public void adding(String username, String password) {
        String sql = String.format("INSERT INTO user(username, password) values('%s','%s')", username, password);

        try {
            jdbcTemplate.update(sql);
            System.out.println("sql in daoimpl " + sql);

        } catch (EmptyResultDataAccessException e) {
            System.out.println("exception");

        }


    }


}
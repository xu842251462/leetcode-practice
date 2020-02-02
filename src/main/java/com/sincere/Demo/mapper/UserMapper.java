package com.sincere.Demo.mapper;


import com.sincere.Demo.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper {
    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        User user = new User();
        user.setUsername(resultSet.getString("username"));
        user.setId(resultSet.getLong("id"));
        user.setPassword(resultSet.getString("password"));

        return user;
    }
}
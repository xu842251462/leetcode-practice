package com.sincere.Demo;

import com.sincere.Demo.dao.UserDao;
import com.sincere.Demo.mapper.UserMapper;
import com.sincere.Demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test  // test if data reach dao
    public void contextLoads() {
        String sql = String.format("select * from user where username='%s'", "Sandy");
        RowMapper mapper = new UserMapper();
        try {
            User user = (User) jdbcTemplate.queryForObject(sql, mapper);
            System.out.println("sql in daoimpl" + sql);
            System.out.println(user);

        } catch (EmptyResultDataAccessException e) {
            System.out.println("exception");
        }

    }


}

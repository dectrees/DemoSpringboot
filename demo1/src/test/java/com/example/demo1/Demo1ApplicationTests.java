package com.example.demo1;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
@Slf4j
class Demo1ApplicationTests {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Resource
    private DataSource dataSource;

    @Test
    void contextLoads() {
        String sql ="select * from user";
        List<User> users = jdbcTemplate.query(sql, new RowMapper<User>() {
            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getInt(1));
                user.setName(rs.getString("name"));
                user.setSchool(rs.getString("school"));
                return user;
            }
        });
        log.info("查询成功");
        log.info("用户{}",users);
    }
    @Test
    public void druidTest(){
        System.out.println(dataSource.getClass());
    }

}

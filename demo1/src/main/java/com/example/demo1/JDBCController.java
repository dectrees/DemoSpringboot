package com.example.demo1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * author : ALEXLIU
 * mail : ninphone@gmail.com
 * created : 3/24/2023, Friday
 **/
@RestController
@Slf4j
public class JDBCController {
    @Resource
    JdbcTemplate jdbcTemplate;

    @Resource
    DataSource dataSource;

    @GetMapping("/getCount")
    public int getCount(){
        String sql = "select count(*) from user";
        Integer number = jdbcTemplate.queryForObject(sql, Integer.class);
        log.info("changed to new DataSource:"+dataSource.getClass());
        return number;
    }
}

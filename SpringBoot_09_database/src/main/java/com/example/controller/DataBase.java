package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Author Huang
 * @ClassName DataBase
 * @Description
 * @Date 2022/8/17 21:02
 * @Version 1.0
 **/
@Controller
public class DataBase {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/jdbc")
    @ResponseBody
    public Map<String, Object> mao() {
        System.out.println("jdbcTemplate = " + jdbcTemplate);
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from department");
        return maps.get(0);
    }

}

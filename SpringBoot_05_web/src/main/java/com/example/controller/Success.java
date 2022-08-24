package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * @Author Huang
 * @ClassName Success
 * @Description
 * @Date 2022/8/14 18:04
 * @Version 1.0
 **/
@Controller

public class Success {

    @RequestMapping("/successes")
    public String successes(Map<String, Object> map) {
        map.put("hello", "黄辉");
        map.put("users", Arrays.asList("huanghui","huangweilong","liqiang"));
        return "success";
    }


    @RequestMapping("/index")
    public String index(){
        return "login";
    }

}

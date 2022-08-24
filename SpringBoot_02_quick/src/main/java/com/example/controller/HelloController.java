package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

/**
 * @Author Huang
 * @ClassName HelloController
 * @Description
 * @Date 2022/8/10 20:43
 * @Version 1.0
 **/
@RestController
@RequestMapping("/hellos")
public class HelloController {

    @Value("${name}")
    private String name;


    @GetMapping
    public String Hello() {

        System.out.println("name = " + name);
        System.out.println("----------------");

        return "Hello Worlds SpringBoot";
    }
}

package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Author Huang
 * @ClassName Success
 * @Description
 * @Date 2022/8/17 16:36
 * @Version 1.0
 **/
@Controller
public class Success {

    @GetMapping("/aabb")
    public String success(Model model) {

        model.addAttribute("msg1", "黄辉");
        return "success";
    }
}

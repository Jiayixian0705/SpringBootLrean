package com.example.controller;

import com.example.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import java.util.Map;

/**
 * @Author Huang
 * @ClassName LoginController
 * @Description
 * @Date 2022/8/15 17:03
 * @Version 1.0
 **/
@Controller
public class LoginController {

    @PostMapping(value = "user/login")
    public String Login(@RequestParam String username,
                        @RequestParam String password,
                        Map<String, Object> map, HttpSession session) {
        session.setAttribute("loginUser", username);

        //进行判断登陆
        if (password.equals("123456")) {

            //使用重定向跳转页面
            return "redirect:/main.html";
        } else {

            map.put("msg", "用户名密码错误");
            return "login";
        }
    }


    @GetMapping("/hello")
    @ResponseBody
    public String hello(@RequestParam("user") String user) {
        if (user.equals("huang")) {
            throw new UserNotExistException();

        }
        return "Hello";
    }

}

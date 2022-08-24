package com.example.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Huang
 * @ClassName MyException
 * @Description
 * @Date 2022/8/16 20:18
 * @Version 1.0
 **/
@ControllerAdvice
public class MyException {


/*
    //将异常全部变成json数据
    @ResponseBody
    @ExceptionHandler(UserNotExistException.class)
    public Map<String, Object> handleException(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", "自己定制的json数据异常");
        map.put("msg", e.getMessage());
        return map;
    }
*/

    //将异常变成Html对应的网页
    @ExceptionHandler(UserNotExistException.class)
    public String handleException(Exception e, HttpServletRequest request, Model model) {
        Map<String, Object> map = new HashMap<>();
        //传入我们自己的错误状态码  4xx 5xx，否则就不会进入定制错误页面的解析流程
        /**
         * Integer statusCode = (Integer) request
         .getAttribute("javax.servlet.error.status_code");
         */
        request.setAttribute("javax.servlet.error.status_code", 500);
        map.put("code", "自己定制的json数据异常");
        map.put("msg", e.getMessage());
        request.setAttribute("ext", map);
        return "forward:/error";
    }
}

package com.example.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author Huang
 * @ClassName LoginHandlerInterceptor
 * @Description
 * @Date 2022/8/15 18:02
 * @Version 1.0
 **/
public class LoginHandlerInterceptor implements HandlerInterceptor {

    //执行页面跳转的方法之前进行拦截
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if (user == null) {
            //放回登陆页面
            request.setAttribute("msg", "没有权限");
            request.getRequestDispatcher("/index.html").forward(request, response);
            return false;
        } else {
            //放行
            return true;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

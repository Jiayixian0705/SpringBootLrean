package com.example.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author Huang
 * @ClassName MyFilter
 * @Description
 * @Date 2022/8/16 22:12
 * @Version 1.0
 **/
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter...");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}

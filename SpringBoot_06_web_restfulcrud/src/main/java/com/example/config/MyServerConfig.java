package com.example.config;

import com.example.filter.MyFilter;
import com.example.listener.MyListener;
import com.example.servlet.MyServlet;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.web.servlet.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.ServletRegistration;
import java.util.Arrays;

/**
 * @Author Huang
 * @ClassName MyServerConig
 * @Description
 * @Date 2022/8/16 22:01
 * @Version 1.0
 **/
@Configuration
public class MyServerConfig {


    //组成三大组件
    @Bean
    public ServletRegistrationBean myServlet() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new MyServlet(), "/myServlet");
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean myFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        //注册filter
        filterRegistrationBean.setFilter(new MyFilter());
        //拦截请求
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/myServlet", "/hello"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener() {
        ServletListenerRegistrationBean listenerRegistrationBean = new ServletListenerRegistrationBean(new MyListener());
        return listenerRegistrationBean;
    }

}

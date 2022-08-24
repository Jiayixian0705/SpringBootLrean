package com.example.config;

import com.example.component.LoginHandlerInterceptor;
import com.example.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Author Huang
 * @ClassName MySpringMvcConfig
 * @Description
 * @Date 2022/8/15 1:11
 * @Version 1.0
 **/
@Configuration
public class MySpringMvcConfig extends WebMvcConfigurerAdapter {


    //注册拦截器
/*    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").
                excludePathPatterns("/index.html", "/", "/user/login", "/asserts/**","/webjars/**");
    }*/

    //所有的webMvcconfigurerAdapter都会起作用
    //注册组件在容器中
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");

    }

    @Bean
    public LocaleResolver localeResolver() {
        return new MyLocaleResolver();
    }
}

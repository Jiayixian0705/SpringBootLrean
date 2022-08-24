package com.example;

import com.example.bean.person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Springboot02QuickApplicationTests {

    @Autowired
    private person person;

    @Autowired
    private ApplicationContext ioc;

    @Test
    void Test(){
        Object iocBean = ioc.getBean("TestController");
        System.out.println("iocBean = " + iocBean);
    }

    @Test
    void contextLoads() {
        System.out.println("person = " + person);
    }

}

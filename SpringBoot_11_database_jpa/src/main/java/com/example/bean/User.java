package com.example.bean;

import javax.persistence.*;

/**
 * @Author Huang
 * @ClassName User
 * @Description
 * @Date 2022/8/18 20:08
 * @Version 1.0
 **/
//这是一个jpa注解类
@Entity
//生成一个名字为name对应的数据表，默认为小写类名
@Table(name = "t_user")
public class User {

    //主键
    @Id
    //主键自增
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    //设置属性对应的列
    @Column(name = "last_name", length = 20)
    private String lastName;
    //默认
    @Column
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

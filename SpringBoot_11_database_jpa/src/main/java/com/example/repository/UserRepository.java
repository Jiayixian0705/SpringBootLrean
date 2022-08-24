package com.example.repository;

import com.example.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author Huang
 * @ClassName UserRepository
 * @Description
 * @Date 2022/8/18 20:14
 * @Version 1.0
 **/
//继承JpaRepository来完成对数据库的操作
public interface UserRepository extends JpaRepository<User, Integer> {

}

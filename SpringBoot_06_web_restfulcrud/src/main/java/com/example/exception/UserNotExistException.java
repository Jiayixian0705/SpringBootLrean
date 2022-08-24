package com.example.exception;

/**
 * @Author Huang
 * @ClassName UserNotExistException
 * @Description
 * @Date 2022/8/16 20:16
 * @Version 1.0
 **/
public class UserNotExistException extends RuntimeException {
    public UserNotExistException() {
        super("用户不存在");
    }
}

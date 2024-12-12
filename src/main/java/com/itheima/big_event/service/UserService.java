package com.itheima.big_event.service;

import com.itheima.big_event.pojo.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User findByUserName(String username);

    // 注册用户
    public void register(String username, String password);
}

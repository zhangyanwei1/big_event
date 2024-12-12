package com.itheima.big_event.service.impl;

import com.itheima.big_event.mapper.UserMapper;
import com.itheima.big_event.pojo.User;
import com.itheima.big_event.service.UserService;
import com.itheima.big_event.utils.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User findByUserName(String username) {
        User u = userMapper.findByUserName(username);
        return u;
    }

    @Override
    public void register(String username, String password) {
        // 密码加密
        String md5String = Md5Util.getMD5String(password);
        // 添加进数据库
        userMapper.add(username, md5String);
    }
}

package com.example.softwaredemo.demos.web.service.impl;

import com.example.softwaredemo.demos.web.pojo.User;
import com.example.softwaredemo.demos.web.mapper.UserMapper;
import com.example.softwaredemo.demos.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserById(int userId) {
        return userMapper.getUserById(userId);
    }

    @Override
    public void addUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    @Override
    public void deleteUser(int userId) {
        userMapper.deleteUser(userId);
    }
}


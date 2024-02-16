package com.example.softwaredemo.demos.web.service;

import com.example.softwaredemo.demos.web.pojo.User;
public interface UserService {
    User getUserById(int userId);
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int userId);
}

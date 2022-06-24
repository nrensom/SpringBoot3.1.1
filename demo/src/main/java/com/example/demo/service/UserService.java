package com.example.demo.service;



import com.example.demo.entity.User;

import java.util.List;

public interface UserService {
    public List<User> getAllUsers();

    public void save(User user);

    public User getUser(long id);

    public void delete(long id);

    public void update(User user);
}

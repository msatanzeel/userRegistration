package com.tanzeel.repository.dao;

import com.tanzeel.repository.entities.User;

import java.util.List;

public interface UserDao {
    public int insert(User user);
    public int update(User user);
    public void delete(String email);
    public User getById(String email);

    public List<User> getAllUsers();
}

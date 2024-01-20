package com.tanzeel.service;

import com.tanzeel.repository.entities.User;

import java.util.List;

public interface UserService {
    int registerUser(User user);

    User getUserById(String email);

    List<User> getAllUsers();

    void deleteUser(String email);

    int updateUser(User user);
}

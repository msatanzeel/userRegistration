package com.tanzeel.service;

import com.tanzeel.repository.dao.UserDao;
import com.tanzeel.repository.dao.UserDaoImpl;
import com.tanzeel.repository.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDao userDaoImpl;
    @Autowired
    public void setUserDaoImpl(UserDao userDaoImpl) {
        this.userDaoImpl = userDaoImpl;
    }

    @PostConstruct
    public void init() {
        System.out.println("Initialised userServiceImpl");
    }


    @Override
    public int registerUser(User user) {
        System.out.println("Inside the user service, registering user " + user);
        assert userDaoImpl != null : "UserDao is null";
        return userDaoImpl.insert(user);
    }

    @Override
    public User getUserById(String email) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void deleteUser(String email) {

    }

    @Override
    public int updateUser(User user) {
        return 0;
    }
}

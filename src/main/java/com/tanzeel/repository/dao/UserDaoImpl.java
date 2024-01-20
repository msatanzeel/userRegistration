package com.tanzeel.repository.dao;

import com.tanzeel.repository.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.annotation.PostConstruct;


import java.util.List;


@Repository
public class UserDaoImpl implements UserDao {
    private HibernateTemplate hibernateTemplate;

    @Autowired
    @Qualifier("hibernateTemplate")
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @PostConstruct
    public void init(){
        System.out.println("Initialised UserDaoImpl Bean");
    }

    @Transactional
    @Override
    public int insert(User user) {
        System.out.println("Inside the UserDaoImpl inserting user: " + user);
        this.hibernateTemplate.save(user);
        return 0;
    }

    @Transactional
    @Override
    public int update(User user) {
        this.hibernateTemplate.update(user);
        return 0;
    }

    @Transactional
    @Override
    public void delete(String email) {
        this.hibernateTemplate.delete(email);
    }

    @Transactional
    @Override
    public User getById(String id) {
        return this.hibernateTemplate.get(User.class, id);
    }

    @Transactional
    @Override
    public List<User> getAllUsers() {
        return this.hibernateTemplate.loadAll(User.class);
    }
}

package com.example.springboot.dao;

import com.example.springboot.entity.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Component
public interface UserDao extends CrudRepository<User,Integer>{


    List<User> findByName(String name);

    List<User> findById(int id);

    List<User> findAll();
}

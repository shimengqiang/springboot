package com.example.springboot.service;

import com.example.springboot.dao.UserDao;
import com.example.springboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao dao;

    public List<User> findByName(String name){

        List<User> userList = dao.findByName(name);

        return userList;
    }

    public List<User> findAll(){

        List<User> userList = dao.findAll();

        return userList;
    }


}

package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IndexController {

    @Autowired
    UserService userService;

//    @RequestMapping(value = "/home",method = RequestMethod.GET)
//    public String index(ModelMap model){
//
//        model.addAttribute("name","baby");
//
//        return "freemaker";
//    }
    @RequestMapping(value = "/getByID/{id}",method = RequestMethod.POST)
    public User findByName(@PathVariable Integer id){

        return userService.findById(id);
    }

    @RequestMapping(value = "/findAll",method = RequestMethod.GET)//model modelmap 均可
    public List<User> findAll(){

        List<User> userList = userService.findAll();
        return userList;
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public User add(@RequestBody User user){


        System.out.println(user.getId());

        return userService.add(user);
    }

    @RequestMapping(value = "/del/{id}",method = RequestMethod.POST)
    public String delById(@PathVariable Integer id){


        userService.delById(id);
        return "sucess";
    }
}

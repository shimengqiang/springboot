package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping()
    public String index(Model model){

        model.addAttribute("name","baby");

        return "index";
    }
    @ResponseBody
    @RequestMapping("/getUser")
    public List<User> findByName(@RequestParam("name")String name){

        List<User> userList = userService.findByName(name);

//        for (int i = 0; i < userList.size(); i++) {
//
//         System.out.println(userList.get(i).getSex());
//
//        }
        return userList;
    }
}

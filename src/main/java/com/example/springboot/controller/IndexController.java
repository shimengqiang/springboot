package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    UserService userService;

    @RequestMapping("/home")
    public String index(ModelMap model){

        model.addAttribute("name","baby");

        return "freemaker";
    }
    @ResponseBody
    @RequestMapping("/getUser")
    public String findByName(@RequestParam("name")String name){

        List<User> userList = userService.findByName(name);

//        for (int i = 0; i < userList.size(); i++) {
////
////         System.out.println(userList.get(i).getSex());
//
//        }
        ModelMap map = new ModelMap();
        map.addAttribute("userList",userList);
        return "userList";
    }

    @RequestMapping("/findAll")//model modelmap 均可
    public String findAll(ModelMap map){

        List<User> userList = userService.findAll();
        map.addAttribute("userList",userList);
        return "userList";
    }

}

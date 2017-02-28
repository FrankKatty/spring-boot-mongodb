package com.melco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.melco.dao.UserDao;
import com.melco.domain.User;

@RestController
@RequestMapping("/melco")
public class HelloController {
	
	 @Autowired
	    private UserDao userDao;

    @RequestMapping
    public String hello() {
        return "Hello Spring-Boot";
    }


    @RequestMapping("/list")
    public List<User> getList() {
        return userDao.getAllUsers();
    }
}
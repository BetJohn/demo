package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.stream.Stream;

import static com.example.demo.model.UserHolder.myList;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping
    public User createUser(){
        return UserService.createUser();
    }
    @GetMapping("/3")
    public ArrayList<User> getAllUsers() {
        return userService.getThreeUsers();
    }
    @PostMapping("/add")
    public void addUserToList(){
        myList.add(User.createUser());
    }
    @GetMapping("seeList")
    public ArrayList<User> showList()
    {
        return myList;
    }
}

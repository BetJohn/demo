package com.example.demo.service;

import com.example.demo.model.User;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

import static com.example.demo.model.User.getRandomNumber;

@Service
public class UserService {
    public static User createUser(){
        Faker faker = new Faker();
        int age = getRandomNumber(0,100);
        return new User(1,faker.name().fullName(),age);
    }
    public ArrayList<User> getThreeUsers(){
        User user1 = createUser();
        User user2 = createUser();
        User user3 = createUser();
        ArrayList<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        return list;
    }
}

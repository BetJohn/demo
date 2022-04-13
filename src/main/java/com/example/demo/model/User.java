package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonTypeId;
import com.github.javafaker.Faker;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.stream.Stream;

@Data
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private Integer age;
    static private Integer maxId = 0;
    public User(Integer id, String name, Integer age) {
        this.id = ++maxId;
        this.name = name;
        this.age = age;
    }
    public static int getRandomNumber(int min, int max) {
        return (int)((Math.random() * (max - min)) + min);
    }
    public static User createUser(){
        Faker faker = new Faker();
        int age = getRandomNumber(0,100);
        return new User(1,faker.name().fullName(),age);
    }
    public static Stream<User> stream(){
        return Stream.of(createUser(),createUser(),createUser());
    }
    public static Integer getMaxId() {
        return maxId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

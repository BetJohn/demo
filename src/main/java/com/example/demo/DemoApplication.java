package com.example.demo;

import com.example.demo.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Acestia sunt primii useri:");
		User.stream().forEach(s-> System.out.println(s.toString()));
		System.out.println("Acestia sunt userii care au peste 18 ani:");
		User.stream().filter(s->(s.getAge()>18)).forEach(s-> System.out.println(s.toString()));
		System.out.println("Ultimul user este:");
		User.stream().filter(s->(s.getId().equals(User.getMaxId()))).forEach(s-> System.out.println(s.toString()));
		System.out.println("Cea mai tanara persoana este:");
		System.out.println(User.stream().sorted((s1, s2) -> s1.getAge() - s2.getAge()).findFirst().toString());
		System.out.println("Cea mai batrana persoana este:");
		System.out.println(User.stream().sorted((s1, s2) -> s2.getAge() - s1.getAge()).findFirst().toString());
		System.out.println("Ii vom afisa pe cei peste 30 de ani:");
		User.stream().filter(s->s.getAge()>30).forEach(s-> System.out.println(s.getName().toUpperCase()));
	}
}

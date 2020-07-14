package com.example.course.resoucers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;

@RestController

@RequestMapping(value = "/users")

public class UserResoucer {
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria","maria@gmail.com","9998877","12345");
		return ResponseEntity.ok().body(u);
	}
	

}

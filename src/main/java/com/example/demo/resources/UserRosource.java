package com.example.demo.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserRosource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Narnia", "narnia@gmail.com", "99999999", "narnia10001");
		return ResponseEntity.ok().body(u);
	}
	
}

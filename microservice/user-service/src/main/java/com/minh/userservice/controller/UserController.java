package com.minh.userservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minh.userservice.entity.User;
import com.minh.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@PostMapping
	public User saveUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	@PutMapping
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	@DeleteMapping("/{id}")
	public boolean deleteUserByID(@PathVariable long id) {
		return userService.deleteUserByID(id);
	}
	@GetMapping("/{id}")
	public Optional<User> findUserById (@PathVariable long id) {
		return userService.findUserByID(id);
	}
	@GetMapping("/find-email/{email}")
	public User findUserByEmail (@PathVariable String email) {
		return userService.findUserByEmail(email);
	}
}

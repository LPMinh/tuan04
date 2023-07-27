package com.minh.userservice.service;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.minh.userservice.entity.User;
@Service
public interface UserService {
	public User saveUser(User user);
	public ResponseEntity<User> updateUser(User user);
	public boolean deleteUserByID(long id);
	public Optional<User> findUserByID(long id);
	public User findUserByEmail(String email);
	
}

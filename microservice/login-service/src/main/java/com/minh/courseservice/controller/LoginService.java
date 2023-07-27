package com.minh.courseservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class LoginService {
	@Autowired
   private com.minh.courseservice.service.LoginService loginService;
   @GetMapping("/login")
   public boolean login(@RequestParam String email,@RequestParam String password) {
	   return loginService.login(email, password);
   }
   	
}

package com.minh.courseservice.service;

import org.springframework.stereotype.Service;

@Service
public interface LoginService {
	public boolean login(String email,String password);
	
}

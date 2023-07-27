package com.minh.courseservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.minh.courseservice.entity.User;
@Service
public class LoginServiceImp implements LoginService{
    private final RestTemplate restTemplate = new RestTemplate();
	@Override
	public boolean login(String email, String password) {
		String apiUrl = "http://localhost:8080/user/find-email/john.doe@example.com";
		User user=restTemplate.getForObject(apiUrl,User.class);
		if(user.getPassword().equals(password)) {
			return true;
		}else {
			return false;
		}
	}

}

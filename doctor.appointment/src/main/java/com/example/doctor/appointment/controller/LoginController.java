package com.example.doctor.appointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctor.appointment.domain.User;
import com.example.doctor.appointment.service.LoginService;


@RestController	
public class LoginController {

	@Autowired
	LoginService loginService;
	
	/**
	 * Returns FALSE if user and pwd is unmatched!
	 * 
	 * @param userId
	 * @param password
	 * @return
	 */
	@CrossOrigin
	@GetMapping("/login")
	@ResponseBody
	private User login(@RequestParam String userId, @RequestParam String password) {
		return loginService.login(userId, password);
	  }
	
	
	/**
	 * Creates a New User (Doctor/Assistant)
	 * @param user
	 */
	@PostMapping("/new-user")
	private void createNewUser(@RequestBody User user) {
		loginService.createNewUser(user);
	  }
	/*
	 * SAMPLE POST RAW BODY=>
	 {
		"userId": "2",
		"userName": "test",
		"userPassword": "123",
		"userType": "doctor",
		"isActive": true
	}
	 */
	
}

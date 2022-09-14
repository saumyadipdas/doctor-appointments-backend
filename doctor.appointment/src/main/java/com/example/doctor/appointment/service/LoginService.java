package com.example.doctor.appointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctor.appointment.dao.LoginDao;
import com.example.doctor.appointment.domain.User;

@Service
public class LoginService {

	@Autowired
	LoginDao loginDao;
	
	
	public User login(String userId, String password) {
		return loginDao.login(userId, password);
	}


	public void createNewUser(User user) {
		loginDao.createNewUser(user);
	}

}

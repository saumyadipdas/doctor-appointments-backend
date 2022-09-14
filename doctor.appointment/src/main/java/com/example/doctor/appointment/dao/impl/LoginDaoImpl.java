package com.example.doctor.appointment.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.doctor.appointment.dao.LoginDao;
import com.example.doctor.appointment.domain.User;
import com.example.doctor.appointment.repository.LoginRepository;

@Repository
@Transactional
public class LoginDaoImpl implements LoginDao{

	
	 @Autowired
	 LoginRepository loginRepository;
	 
	 
	@Override
	public User login(String userId, String password) {
		//return loginRepository.validateUserIdPassword(userId, password)>0 ? true : false;
		return loginRepository.validateUserIdPassword(userId, password);
	}


	@SuppressWarnings("unchecked")
	@Override
	public void createNewUser(User user) {
		loginRepository.save(user);
	}

}

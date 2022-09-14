package com.example.doctor.appointment.dao;

import org.springframework.stereotype.Repository;

import com.example.doctor.appointment.domain.User;

@Repository	
public interface LoginDao {

	boolean login(String userId, String password);

	void createNewUser(User user);

}

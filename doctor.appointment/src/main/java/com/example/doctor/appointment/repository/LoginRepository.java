package com.example.doctor.appointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.doctor.appointment.domain.User;

public interface LoginRepository extends JpaRepository<User, String>{

	
	//@Query(value="select count(1) from User a where a.userName= :uname AND a.userPassword= :pwd", nativeQuery=true)
	@Query(value="select count(1) from User a where a.USER_NAME= :uname AND a.USER_PASSWORD= :pwd", nativeQuery=true)
	int validateUserIdPassword(String uname, String pwd);
	
	
}

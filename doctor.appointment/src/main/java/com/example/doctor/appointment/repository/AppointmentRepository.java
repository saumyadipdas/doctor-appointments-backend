package com.example.doctor.appointment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.doctor.appointment.domain.Appointment;
import com.example.doctor.appointment.domain.User;

public interface AppointmentRepository extends CrudRepository<Appointment, String> {

	
	@Query(value="select * from Appointment where RESPONSIBLE_DOCTOR_ID= :docId", nativeQuery=true)
	List<Appointment> findAppointmentsByDoctorId(String docId);

	@Query(value="select * from User where USER_TYPE = 'DOCTOR' ", nativeQuery=true)
	List<User> findDoctorLists();

}
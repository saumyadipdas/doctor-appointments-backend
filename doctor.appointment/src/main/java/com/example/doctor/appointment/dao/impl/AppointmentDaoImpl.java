package com.example.doctor.appointment.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.doctor.appointment.dao.AppointmentDao;
import com.example.doctor.appointment.domain.Appointment;
import com.example.doctor.appointment.domain.User;
import com.example.doctor.appointment.repository.AppointmentRepository;
import com.example.doctor.appointment.repository.LoginRepository;

@Repository
@Transactional
public class AppointmentDaoImpl implements AppointmentDao{

	@Autowired
	AppointmentRepository appointmentRepository;
	@Autowired
	LoginRepository loginRepository;
	
	@Override
	public List<Appointment> viewAppointmentsByDoctorId(String responsibleDoctorId) {
		 return appointmentRepository.findAppointmentsByDoctorId(responsibleDoctorId);
	}

	@Override
	public List<Appointment> viewAppointmentsByDate(String responsibleDoctorId, String selectedDate) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * New appointment
	 */
	@Override
	public Appointment createNewAppointment(Appointment newAppointment) {
		return appointmentRepository.save(newAppointment);
	}



	@Override
	public Appointment updateAppointment(Appointment appointment) {
		return appointmentRepository.save(appointment);
	}

	@Override
	public String deleteById(String appointmentId) {
		try {
			appointmentRepository.deleteById(appointmentId);
			return appointmentId;
		}catch(Exception e) {
			return null;
		}
	}

	@Override
	public List<User> getDoctorsList() {
		// TODO Auto-generated method stub
		return loginRepository.findDoctorLists();
	}

	
}

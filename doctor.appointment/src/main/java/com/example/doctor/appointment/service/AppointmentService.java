package com.example.doctor.appointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctor.appointment.dao.AppointmentDao;
import com.example.doctor.appointment.domain.Appointment;
import com.example.doctor.appointment.domain.User;

@Service
public class AppointmentService {
	
	
	@Autowired
	AppointmentDao appointmentDao;
	

	public List<Appointment> viewAppointmentsByDoctorId(String responsibleDoctorId) {
		// TODO Auto-generated method stub
		return appointmentDao.viewAppointmentsByDoctorId(responsibleDoctorId);
	}

	public List<Appointment> viewAppointmentsByDate(String responsibleDoctorId, String selectedDate) {
		// TODO Auto-generated method stub
		return appointmentDao.viewAppointmentsByDate(responsibleDoctorId, selectedDate);
	}

	public Appointment createNewAppointment(Appointment newAppointment) {
		// TODO Auto-generated method stub
		return appointmentDao.createNewAppointment(newAppointment);
	}

	public Appointment updateAppointment(Appointment appointment) {
		// TODO Auto-generated method stub
		return appointmentDao.updateAppointment(appointment);
	}

	public String deleteById(String appointmentId) {
		// TODO Auto-generated method stub
		return appointmentDao.deleteById(appointmentId);
	}

	public List<User> getDoctorsList() {
		// TODO Auto-generated method stub
		return appointmentDao.getDoctorsList();
	}

}

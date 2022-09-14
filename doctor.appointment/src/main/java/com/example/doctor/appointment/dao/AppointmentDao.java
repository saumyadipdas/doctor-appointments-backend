package com.example.doctor.appointment.dao;

import java.util.List;

import com.example.doctor.appointment.domain.Appointment;
import com.example.doctor.appointment.domain.User;

public interface AppointmentDao {

	List<Appointment> viewAppointmentsByDoctorId(String responsibleDoctorId);

	List<Appointment> viewAppointmentsByDate(String responsibleDoctorId, String selectedDate);

	Appointment createNewAppointment(Appointment newAppointment);

	Appointment updateAppointment(Appointment appointment);

	String deleteById(String appointmentId);

	List<User> getDoctorsList();

}

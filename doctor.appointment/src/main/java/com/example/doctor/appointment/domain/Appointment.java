package com.example.doctor.appointment.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;



@Entity
public class Appointment {

	@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@GeneratedValue(generator = "sequence-generator")
//    @GenericGenerator(
//      name = "sequence-generator",
//      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//      parameters = {
//        @Parameter(name = "sequence_name", value = "appointment_sequence"),
//        @Parameter(name = "initial_value", value = "4"),
//        @Parameter(name = "increment_size", value = "1")
//        }
//    )
	@Column(name = "APPOINTMENT_ID")
	private String appointmentId;
	
	@Column(name = "APPOINTMENT_TITLE")
	private String appointmentTitle;
	
	//@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "PATIENT_ID", referencedColumnName = "patientId")
	//private PatientDetail patient;
	
	@Column(name = "APP_START_DATE_TIME")
	private String appointmentStartDateTime;
	
	@Column(name = "APP_END_DATE_TIME")
	private String appointmentEndDateTime;
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "RESPONSIBLE_DOCTOR_ID", referencedColumnName = "USER_ID")
//	//@JsonBackReference
//	private User doctor;

	@Column(name = "RESPONSIBLE_DOCTOR_ID")
	private String responsibleDoctorId;
	
	@Column(name = "APPOINTMENT_STATUS")
	//@Enumerated(EnumType.ORDINAL)
	@Enumerated(EnumType.STRING)
	private AppointmentStatus appointmentStatus;
	
	@Column(name = "APPOINTMENT_CREATED_BY")
	private String appointmentCreatedBy;
	
	@Column(name = "APPOINTMENT_CREATED_TIMESTAMP")
	private Date appointmentCreatedTimestamp;

	@Column(name = "APPOINTMENT_UPDATED_BY")
	private String appointmentUpdatedBy;

	@Column(name = "APPOINTMENT_UPDATED_TIMESTAMP")
	private Date appointmentUpdatedTimestamp;

	@PrePersist
	protected void onCreate() {
		appointmentCreatedTimestamp = new Date();
	}

	@PreUpdate
	protected void onUpdate() {
		appointmentUpdatedTimestamp = new Date();
	}

	
	
	/***
	 * GETTER - SETTERS
	 *
	 */
	
	
	public String getAppointmentId() {
		return appointmentId;
	}

	public void setAppointmentId(String appointmentId) {
		this.appointmentId = appointmentId;
	}

	public String getAppointmentTitle() {
		return appointmentTitle;
	}

	public void setAppointmentTitle(String appointmentTitle) {
		this.appointmentTitle = appointmentTitle;
	}

//	public PatientDetail getPatient() {
//		return patient;
//	}
//
//	public void setPatient(PatientDetail patient) {
//		this.patient = patient;
//	}

	public String getAppointmentStartDateTime() {
		return appointmentStartDateTime;
	}

	public void setAppointmentStartDateTime(String appointmentStartDateTime) {
		this.appointmentStartDateTime = appointmentStartDateTime;
	}

	public String getAppointmentEndDateTime() {
		return appointmentEndDateTime;
	}

	public void setAppointmentEndDateTime(String appointmentEndDateTime) {
		this.appointmentEndDateTime = appointmentEndDateTime;
	}

//	public User getDoctor() {
//		return doctor;
//	}
//
//	public void setDoctor(User doctor) {
//		this.doctor = doctor;
//	}

	public AppointmentStatus getAppointmentStatus() {
		return appointmentStatus;
	}

	public void setAppointmentStatus(AppointmentStatus appointmentStatus) {
		this.appointmentStatus = appointmentStatus;
	}

	public String getAppointmentCreatedBy() {
		return appointmentCreatedBy;
	}

	public void setAppointmentCreatedBy(String appointmentCreatedBy) {
		this.appointmentCreatedBy = appointmentCreatedBy;
	}

	public Date getAppointmentCreatedTimestamp() {
		return appointmentCreatedTimestamp;
	}

	public void setAppointmentCreatedTimestamp(Date appointmentCreatedTimestamp) {
		this.appointmentCreatedTimestamp = appointmentCreatedTimestamp;
	}

	public String getAppointmentUpdatedBy() {
		return appointmentUpdatedBy;
	}

	public void setAppointmentUpdatedBy(String appointmentUpdatedBy) {
		this.appointmentUpdatedBy = appointmentUpdatedBy;
	}

	public Date getAppointmentUpdatedTimestamp() {
		return appointmentUpdatedTimestamp;
	}

	public void setAppointmentUpdatedTimestamp(Date appointmentUpdatedTimestamp) {
		this.appointmentUpdatedTimestamp = appointmentUpdatedTimestamp;
	}


	
	

	
	
	
}

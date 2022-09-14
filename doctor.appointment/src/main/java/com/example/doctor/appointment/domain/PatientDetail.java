package com.example.doctor.appointment.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "PATIENT_DETAIL") 
public class PatientDetail {


	//@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GenericGenerator(
//    	      name = "sequence-generator",
//    	      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//    	      parameters = {
//    	        @Parameter(name = "sequence_name", value = "patient_sequence"),
//    	        @Parameter(name = "initial_value", value = "1"),
//    	        @Parameter(name = "increment_size", value = "1")
//    	        }
//    	    )
	@Id
//	@GeneratedValue(
//	    strategy = GenerationType.SEQUENCE,
//	    generator = "seq_patient"
//	)
//	@SequenceGenerator(
//	    name = "seq_patient"
//	)
	//@GeneratedValue(generator = "TableGen_Patient")
	//@TableGenerator(name = "TableGen_Patient")
	@Column(name = "PATIENT_ID")
	private String patientId;
	
	@Column(name = "PATIENT_NAME")
	private String patientName;
	
	@Column(name = "PATIENT_PHONE_NUMBER")
	private String patientPhoneNumber;
	
	@Column(name = "PATIENT_ADRESS")
	private String patientAdress;
	
	@Column(name = "PATIENT_PRESCRIPTION")
	private String patientPrescription;

	
	
	
	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientPhoneNumber() {
		return patientPhoneNumber;
	}

	public void setPatientPhoneNumber(String patientPhoneNumber) {
		this.patientPhoneNumber = patientPhoneNumber;
	}

	public String getPatientAdress() {
		return patientAdress;
	}

	public void setPatientAdress(String patientAdress) {
		this.patientAdress = patientAdress;
	}

	public String getPatientPrescription() {
		return patientPrescription;
	}

	public void setPatientPrescription(String patientPrescription) {
		this.patientPrescription = patientPrescription;
	}
	
	
	
}

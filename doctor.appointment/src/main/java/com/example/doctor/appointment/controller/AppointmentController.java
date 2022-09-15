package com.example.doctor.appointment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctor.appointment.domain.Appointment;
import com.example.doctor.appointment.domain.User;
import com.example.doctor.appointment.service.AppointmentService;

@RestController
public class AppointmentController {

	@Autowired
	AppointmentService appointmentService;

	@CrossOrigin
	@GetMapping("/view-appointments")
	@ResponseBody //The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object.
	private List<Appointment> viewAppointmentsByDoctorId(@RequestParam String responsibleDoctorId) {
		return appointmentService.viewAppointmentsByDoctorId(responsibleDoctorId);
	}
	
	@CrossOrigin
	@GetMapping("/view-appointments-by-doctor-and-date")
	@ResponseBody
	private List<Appointment> viewAppointmentsByDate(@RequestParam String responsibleDoctorId, @RequestParam String selectedDate) {
		return appointmentService.viewAppointmentsByDate(responsibleDoctorId, selectedDate);
		
		//return ResponseEntity.badRequest().body("Year of birth cannot be in the future");
	}

//	@SuppressWarnings("unchecked")
//	@PostMapping("/create-appointment")
//	private ResponseEntity<Appointment> createNewAppointment(@RequestBody Appointment newAppointment) {
//		try {
//			Appointment savedAppointment = appointmentService.createNewAppointment(newAppointment);
//			//return (ResponseEntity<Appointment>)ResponseEntity.status(HttpStatus.OK).body(savedAppointment);
//			 return ResponseEntity.ok(savedAppointment);
//        } catch (DataAccessException e) {
//        	e.printStackTrace();
//            return (ResponseEntity<Appointment>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
//        }
//	}

	
	//@SuppressWarnings("unchecked")
	@CrossOrigin
	@PostMapping("/create-appointment")
	private ResponseEntity<String> createNewAppointment(@RequestBody Appointment newAppointment) {
		try {
			Appointment savedAppointment = appointmentService.createNewAppointment(newAppointment);
			//return (ResponseEntity<Appointment>)ResponseEntity.status(HttpStatus.OK).body(savedAppointment);
			 return ResponseEntity.ok("Appointment Successfully saved!");
        } catch (DataAccessException e) {
        	e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error in creating new appointment!");
        } catch (Exception e) {
	    	e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error in creating new appointment!");
	    }
	}
	
	
	//@SuppressWarnings("unchecked")
	@CrossOrigin
	@PutMapping("/update-appointment")
	private ResponseEntity<String> updateAppointment(@RequestBody Appointment appointment) {
		try {
			Appointment savedAppointment = appointmentService.updateAppointment(appointment);
			return ResponseEntity.ok("Appointment Successfully updated!");
        } catch (DataAccessException e) {
        	e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error in updating the appointment!");
		} catch (Exception e) {
	    	e.printStackTrace();
	        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error in updating the appointment!");
	    }
	}
	
//	@PutMapping("/complete-appointment")
//	private void completeAppointment(@RequestBody Appointment appointment) {
//		appointmentService.completeAppointment(appointment);
//	}

	@SuppressWarnings("unchecked")
	@CrossOrigin
	@DeleteMapping("/delete-appointment/{appointmentId}")
    public ResponseEntity<String> deleteAppointmentById(@PathVariable String appointmentId) {
        try {
            String deletedAppointmentId = appointmentService.deleteById(appointmentId);
            if (deletedAppointmentId != null) {
                return ResponseEntity.status(HttpStatus.OK).body("Successfully deleted the appointment with id: " +appointmentId);
            } else {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Issue in deleting the Appointment!");
            }
         } catch (DataAccessException e) {
             return (ResponseEntity<String>) ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR);
         }
	}
	
	
	@GetMapping("/get-doctors-list")
	@CrossOrigin
	@ResponseBody
	private List<User> getDoctorsList() {
		return appointmentService.getDoctorsList();
	}
	
	
	@CrossOrigin
	@GetMapping("/notfound")
    ResponseEntity<String> notfound() {
        return ResponseEntity.notFound().build();
    }

	@CrossOrigin
    @GetMapping("/badrequest")
    ResponseEntity<String> badRequest() {
        return ResponseEntity.badRequest().body("Bad request");
    }
	
}

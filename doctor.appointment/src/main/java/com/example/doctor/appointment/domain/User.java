package com.example.doctor.appointment.domain;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class User {


	//@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @GenericGenerator(
//    	      name = "sequence-generator",
//    	      strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
//    	      parameters = {
//    	        @Parameter(name = "sequence_name", value = "user_sequence"),
//    	        @Parameter(name = "initial_value", value = "1"),
//    	        @Parameter(name = "increment_size", value = "1")
//    	        }
//    	    )
	@Id
//	@GeneratedValue(
//	    strategy = GenerationType.SEQUENCE,
//	    generator = "seq_user"
//	)
//	@SequenceGenerator(
//	    name = "seq_user",
//	    initialValue = 1,
//	    allocationSize=1
////	    		parameters = {
////	    	            @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
////	    	            @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "B_"),
////	    	            @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") }
//	)
	//@GeneratedValue(generator = "TableGen_User")
	//@TableGenerator(name = "TableGen_User")
	@Column(name = "USER_ID")
	private String userId;


	@Column(name = "USER_NAME", length = 50, nullable = false, unique = true)
//	@Column(name = "USER_NAME", length = 50, nullable = false, unique = false)
	private String userName;

	@Column(name = "USER_PASSWORD", length = 50, nullable = false, unique = false)
	private String userPassword;

	@Column(name = "USER_TYPE")
	@Enumerated(EnumType.STRING)
	private UserTypes userType;

	
	//@Column(name = "USER_IS_ACTIVE", columnDefinition = "boolean default true")
	@Column(name = "USER_IS_ACTIVE")
	private Boolean isActive = true;

	@Column(name = "CREATED_DATE_TIME")
	@CreationTimestamp
	private LocalDateTime createDateTime;

	@Column(name = "UPDATED_DATE_TIME")
	@UpdateTimestamp
	private LocalDateTime updateDateTime;

	
	/**
	 * GETTERS - SETTERS
	 *
	 */

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserTypes getUserType() {
		return userType;
	}

	public void setUserType(UserTypes userType) {
		this.userType = userType;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	
	
}

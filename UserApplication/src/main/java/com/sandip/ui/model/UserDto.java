package com.sandip.ui.model;

import java.io.Serializable;

//data transfer object
public class UserDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String emailVerficationToken;
	private boolean emailVerificationStats = false;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmailVerficationToken() {
		return emailVerficationToken;
	}
	public void setEmailVerficationToken(String emailVerficationToken) {
		this.emailVerficationToken = emailVerficationToken;
	}
	public Boolean getEmailVerificationStats() {
		return emailVerificationStats;
	}
	public void setEmailVerificationStats(Boolean emailVerificationStats) {
		this.emailVerificationStats = emailVerificationStats;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}

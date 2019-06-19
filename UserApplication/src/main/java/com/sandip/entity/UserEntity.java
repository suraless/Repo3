package com.sandip.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="UserTable")
public class UserEntity implements Serializable {

		private static final long serialVersionUID = 1L;
		
		@Id
		 @GeneratedValue(strategy= GenerationType.IDENTITY)
		private long id;
		
		@Column(nullable = false)
		
		/*private String userId;
		@Column(nullable = false, length=50)*/
		
		private String firstName;
		
		private String lastName;
		
		private String password;
		
		private String email;
		
		private Boolean emailVerificationStatus = false;
		
		private String emailVerificationToken;
		
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public Boolean getEmailVerificationStatus() {
			return emailVerificationStatus;
		}
		public void setEmailVerificationStatus(Boolean emailVerificationStatus) {
			this.emailVerificationStatus = emailVerificationStatus;
		}
		public String getEmailVerificationToken() {
			return emailVerificationToken;
		}
		public void setEmailVerificationToken(String emailVerificationToken) {
			this.emailVerificationToken = emailVerificationToken;
		}
		
		
		

}

package com.login.demo.Entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class LoginData {

		@NotBlank(message = "username can not be empty")
		@Size(min = 3,max = 20,message ="Please ensure the username is more than 3 in size and less than 20 !!" )
		private String userName;
		
		
		private String email;
		
		private String password;
		
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
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
		@Override
		public String toString() {
			return "LoginData [userName=" + userName + ", email=" + email + ", password=" + password + "]";
		}
		
		
		
	
}

package com.syntax.class15;

public class Task1 {
		String username = "medine";
		String password = "kaya8412345";
		String confirmedPassword = "kaya84";
		
		void checkUserNamePassword(String username, String password,String confirmedPassword) {
		if (username.isEmpty() && password.isEmpty()) {
			System.out.println("username and password can not be empty");
		} else {
			if (password.length() < 8) {
				System.out.println("password is too short");
			} else {
				if (password.contains(username)) {
					System.out.println("password cannot contain username");

				} else {
					if (password.equals(confirmedPassword)) {
						System.out.println("your username and password has been created");
					} else {
						System.out.println("passwords do not match");
					}
				}
			}
		}}
		public static void main(String[] args) {
			/*
			 * Accept username, password and confirm password from a user and check
			 * following requirements: Username and Password cannot be empty, if so→
			 * message=”Username and Password cannot be empty”. Password should be minimum 8
			 * characters, if less → message=”Password is too short”. Password cannot
			 * contain username if so, → message=”Password cannot contain username”.
			 * Password should match confirmed password, if not → message=“Passwords do not
			 * match”. Only after all requirements met → message “Your username and password
			 * has been created”
			 */
	Task1 object=new Task1();
	object.checkUserNamePassword("medine", "kaya8412345", "kaya85");
}}
package com.syntax.class14;

public class Homework1 {
	
	String password(String username, String passWord) {
		if (username.isEmpty()  && passWord.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
		} else if (passWord.length()<8) {
			System.out.println("Password is too short");
	} else if (passWord.contains(username)) {
		System.out.println("Password can not contain username");
	}
	return "Your username and password and password has been created";
	}

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
	Homework1 obj=new Homework1();
	
	System.out.println(obj.password("Medine", "123456789"));
	System.out.println(obj.password("Medine", "12389"));
	System.out.println(obj.password("Medine", "12389Medine"));
	System.out.println(obj.password("Medine", "Medine"));
	
	}

}

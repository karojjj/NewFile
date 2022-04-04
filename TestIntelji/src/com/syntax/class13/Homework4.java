package com.syntax.class13;

public class Homework4 {
	// Create a method createEmail(). Based on values of users name, lastName and
	// email type, your method should return complete email Address. Example:
	// createEmail(John, Snow, gmail) → johnsnow@gmail.com or
	 
	String createEmail(String name,String lastName,String emailType) {
		
		return  name+lastName+"@"+emailType+".com";
	}
	

	public static void main(String[] args) {
		 
		Homework4 userInfo=new Homework4();
		userInfo.createEmail("john", "snow", "gmail");
	
		System.out.println(userInfo.createEmail("john", "snow", "gmail"));
		

	}

}

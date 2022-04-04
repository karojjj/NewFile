package com.syntax.class14;

public class Task4 {
    String createEmail(String username, String lastName,  String emailType) {
    	return username+lastName+"@"+emailType+".com";
    }
	public static void main(String[] args) {
		/*
		 * create a method createEmail().based on value of users name, lastName, and
		 * email type, your method should return complete email address.Example
		 * :createEmail(John, Snow,gmail) johnsnow@gmail.com
		 */
		Task4 obj=new Task4();
		System.out.println(obj.createEmail("medine", "kaya", "gmail"));

	}

}

package com.syntax.class15;

public class StringDemo1 {

	public static void main(String[] args) {
		String userName="Lilly";
		String password="Lilly123";
		if("Lilly".equalsIgnoreCase(userName) && "Lilly123".equals(password)) {
			System.out.println("welcome back");
		} else {
			System.out.println("username or password are not correct");
		}

	}

}

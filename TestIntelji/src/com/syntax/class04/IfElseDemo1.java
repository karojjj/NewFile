package com.syntax.class04;

public class IfElseDemo1 {

	public static void main(String[] args) {
		String userName="Medine";
		String password="Password123";
		if (userName.equals("Medine") && password.equals("Password123")) {
			System.out.println("welcome back "+ userName);
		}else {
			System.out.println("Invalid credentials");
		}

	}

}

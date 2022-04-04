package com.replit.exercises;

import java.util.Scanner;

public class Replit20 {

	

	public static void main(String[] args) {
		
		
		Scanner med= new Scanner(System.in);
		
        System.out.println("Please Enter First Name");
        String firstName = med.nextLine();
        
        System.out.println("Please Enter Last Name");
        String lastName = med.nextLine();
        
        System.out.println(firstName + " " + lastName);
    }
}
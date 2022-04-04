package com.syntax.class07;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {
		// Ask a user to enter name, last name and age 5 times. Every time your program
		// should print those values in a format “You name is _ _ and you are _ years
		// old’
		
		Scanner med = new Scanner(System.in);
		
		for (int x=1; x<=5; x++) {
			
		System.out.println("name");
		String name = med.nextLine();
		
		System.out.println("Lastname");
		String lastname = med.nextLine();
		
		System.out.println("age");
		int age = med.nextInt();
		
		med.nextLine();
	
			System.out.println("Your name is "+name+" "+lastname+" and your are "+age+" years old.");
		}

	}

}

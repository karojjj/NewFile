package com.syntax.class05;
import java.util.Scanner;

public class PossibleIssues {

	public static void main(String[] args) {
		// next()  vs nextline();
		Scanner scan=new Scanner(System.in);
		System.out.println("using next");
		
		String value=scan.next();
		System.out.println(value);
		scan.nextLine();
		System.out.println("Capturing values using nextLine");
		
		String value1=scan.nextLine();
		System.out.println(value1);
	    System.out.println("End of the program");
	}
	
	

}

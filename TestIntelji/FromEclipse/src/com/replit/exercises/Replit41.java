package com.replit.exercises;
import java.util.Scanner;
public class Replit41 {

	public static void main(String[] args) {
		/*Write a program using the switch statement

		Let us consider the scenario regarding the born baby age

		First Output: "Enter the age of the Child"
		case 1: if age is 1 print as "You can Crawl"
		case 2 : if age is 2 print as  "You can Talk"
		case 3: If age is 3 print as "You can Dance"
		case 4: if age is 4 print as "You can get Trouble"
		Other than this age (1-4) it should print "I don't know how old you are" 
		*/
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the age of the child");
		int age=input.nextInt();
		String a=" ";
		 switch(age){
		 case 1:
			 a="You can crawl";
			 break;
		 case 2:
			 a="You can talk";
			 break;
		 case 3:
			 a="You can dance";
			 break;
		 case 4:
			 a="You can get trouble";
			 break;
			 default:
				 a="I do not know how old you are";
		 }
		System.out.println(a);
	}

}

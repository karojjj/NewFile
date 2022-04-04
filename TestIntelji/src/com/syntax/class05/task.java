package com.syntax.class05;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//*lets ask user what is today day
		
		//based on date lets define whether which class we have
		 //if (Monday or Friday)==> there is no class today
		 // else if(Tuesday or Wednesday)==> manual class
		 //else( Thursday )==> review class
		 //else if(Saturday or Sunday)==> java class
		
		Scanner input = new Scanner(System.in);
			System.out.println("What is the today date");
			String days=input.nextLine();
			
			 if( days.equalsIgnoreCase("Monday") || days.equalsIgnoreCase("Friday")){
				 System.out.println("There is no class today");
			 }else if ( days.equalsIgnoreCase("Tuesday") || days.equalsIgnoreCase("Wednesday")) {
				 System.out.println("I have manual testing class");
			 }else if (days.equalsIgnoreCase("Saturday") || days.equalsIgnoreCase("Sunday")) {
				 System.out.println("I have a Java clas");
			 }else  {
				 System.out.println("I have only Review class");
	}

}
}
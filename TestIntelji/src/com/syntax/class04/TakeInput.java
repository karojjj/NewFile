package com.syntax.class04;

import java.util.Scanner;
public class TakeInput {

	public static void main(String[] args) {
	
		//1:create a Scanner and assign a variable
	Scanner		scan=new Scanner(System.in);
			
	//2:specify the  instructions
	System.out.println("Please enter where are you from ?");
	//3. we need to capture string value==>use next();
	String country=scan.next();
	System.out.println("You are from "+country);
	
	//if you are from USA ==>YOU SPEAK ENGLISH
	//IF YOU ARE FROM TURKEY YOU SPEAK TURKISH
	
	if (country.equalsIgnoreCase("USA")) {
		System.out.println("you speak english");
	}else if(country.equalsIgnoreCase("France")) {
		System.out.println("you speak french");
	}else if(country.equalsIgnoreCase("Turkey")) {
		System.out.println("you speak turkish");
	} else {
		System.out.println("I do not know which language you speak");
	}
	}

}

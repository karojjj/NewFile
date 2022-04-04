package com.syntax.class04;
import java.util.Scanner;
public class LoanSpecialistHW {

	public static void main(String[] args) {
		/*
		 * 1. You are a loan specialist and you need to ask user what is the amount of loan
		 * is needed. If loan is less or equal to 200,000 then you would lend the money
		 * otherwise you would reject the client. 
		 * 
		 */
		Scanner loan=new Scanner(System.in);
		System.out.println("Please enter your loan amount ");
		
	int money=loan.nextInt();
	if (money<=200000) {
		System.out.println("You are eligible for loan");
	}else {
		System.out.println("Sorry we are not able you any loan offer at this time");
	}
		

	}

}

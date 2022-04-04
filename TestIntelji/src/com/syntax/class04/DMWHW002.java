package com.syntax.class04;
import java.util.Scanner;
public class DMWHW002 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you
		 * need to ask customer their age. If they are 18 and older you will issue a
		 * driver license to them, otherwise you will offer them to get a learners
		 * permit.
		 */
		Scanner dmv=new Scanner(System.in);
		System.out.println("How old  are you ?");
		int age=dmv.nextInt();
		
		if(age >=18) {
			System.out.println("We will issue a driver license for you");
		}else {
			System.out.println("Please get a learner permit !");
		}
			
	}

}

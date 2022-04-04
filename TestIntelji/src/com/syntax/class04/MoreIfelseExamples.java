package com.syntax.class04;

import java.util.Scanner;

public class MoreIfelseExamples {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a grade : ");
		int n = scan.nextInt();
		System.out.println(n);
		if (n>=90 && n<=100) {
			System.out.println("A");
		}else if(n>=80 && n<=70){
			System.out.println("B");
		}else if(n>=70 && n<=60){
			System.out.println("C");
		}else if(n>=60 && n<=50);
		System.out.println("D");
	}
	
	    	



}


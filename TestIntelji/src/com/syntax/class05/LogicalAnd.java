package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		// and &&
		boolean likeJava = true;
		boolean practice=true;
		boolean understandJava = false;
		if (likeJava && understandJava && practice) {
			System.out.println("This is the best combination");

		}
		System.out.println("End of the code");

		// we want to compare three numbers
		/*
		 * if num1 >num2 and && num1>num3 ==> num1 is the largest number what if(else
		 * if) num2>num1 &&num2>num3==> num2 is the largest number what id (else if)
		 * num3>num1 && num3>num2==> num3 is the largest number
		 * 
		 */
		int num1=10;
		int num2=200;
		int num3=30;
		if (num1>num2 && num1>3) 
			System.out.println(num1+" is the largest");
		 else if ( num2>num1 && num2>num3) 
			System.out.println(num2+" is the largest");
		else if (num3>num1 && num3>num2) 
			System.out.println(num3+" is the largest");
		

	}
}

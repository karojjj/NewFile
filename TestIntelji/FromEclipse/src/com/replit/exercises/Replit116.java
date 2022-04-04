package com.replit.exercises;

public class Replit116 {
	boolean test(int num1, int num2) {
		if(num1%2==0) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		/*
		 * Create a method that will accept 2 numbers as parameters and return true if
		 * both numbers are even otherwise returned false
		 * ( Return false if one or both given numbers are not even)
		 * Examples:
		 * bothEven(4,6) ==> true bothEven(3,4) ==> false bothEven(-1,1) ==> false
		 */
		Replit116 obj=new Replit116();
		System.out.println(obj.test(4,6));

	}

}

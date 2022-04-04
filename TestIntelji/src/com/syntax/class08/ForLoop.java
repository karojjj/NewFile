package com.syntax.class08;

public class ForLoop {

	public static void main(String[] args) {
		int value = 1;
		for (int i = 1; i < 4; i++) {
			value *= i;
		}
		System.out.println(value);

		/*
		 * find out the sum of all even and all odd numbers from range 1 to 50
		 */
		System.out.println("=====Task=====");
		
		int sumEven=0;
		int sumOdd=0;
		for (int i=1; i<=50; i++) {
			if (i%2==0) {
				 sumEven=sumEven+i;	
			} else {
	        sumOdd=sumOdd+i;
			}
		}
		System.out.println("The sum of all even numbers = " +sumEven+" and the sum of all odd numbers = "+ sumOdd);
		
		System.out.println("ANOTHER WAY TO FIND SUM OF EVEN AND ODD");
		int summm = 0;
		for (int i= 2; i<=50;i+=2) {
			summm+=i;
		}
		System.out.println(summm);
		int sumx=0;
		for (int i=1; i<=50; i+=2) {
			sumx +=i;
		}
		System.out.println(sumx);
	}
	
      
}

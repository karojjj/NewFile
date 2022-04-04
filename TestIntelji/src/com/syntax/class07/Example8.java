package com.syntax.class07;

public class Example8 {

	public static void main(String[] args) {
		// find out the sum of all even and all odd numbers from the range 1 to 50
		int even = 0;
		int odd = 0;
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				even = even + i;
			} else {
				odd = odd + i;
			}
		}
		System.out.println("the sum of all even numbers = " + even + " and  the sum of all odd numbers = " + odd);
          System.out.println("ANOTHER WAY TO FIND SUM OF EVEN AND ODD");
          
         int sum = 0;
		for (int b=2; b<=50; b+=2) {
        	   sum += b;
          }
		System.out.println(sum);
		
		int sum1=0;
		for (int a=1; a<=50; a+=2) {
			sum1+=a;
		}
		System.out.println(sum1);
	}
}

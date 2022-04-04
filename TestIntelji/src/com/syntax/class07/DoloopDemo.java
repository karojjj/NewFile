package com.syntax.class07;

public class DoloopDemo {

	public static void main(String[] args) {
		System.out.println("===WHILE CHECK CONDITION BEFORE THE EXECUTION");
		//repeat the block of code if the condition is true
		int num = 10;
		while (num <= 3) { // is more uded than do while
			System.out.println("hello");// five times
         num++;
		}
		System.out.println("====do while CHECK CONDITION AFTER THE EXECUTION ====");
		
		
     int num1=10;
     do { // is lesss used than while
    	 System.out.println("hello");
    	 num1++;
     } while (num1<=3);// condition is false
     System.out.println("I want to print numbers from 1 to 30 using while loop");
     
     
      int num2=1;
      do {
    	 System.out.print(num2+" ");
    	 num2++;
      } while (num2<30);
      System.out.print(num2);
    
	}

}

package com.syntax.class03;

public class RelationalOperators {
//>,>=,<,<=, ==, !=
	public static void main(String[] args) {
		int num1=10;
		int num2=16;
		System.out.println(num1>num2);// false because > means bigger than
		System.out.println(num1==num2);//false because == means  equal to
		System.out.println(num1<num2);//true because <  means less than
		boolean result= num1==num2;// == equal to
		System.out.println("Result is " +result);
		System.out.println(num1=num2);// here we assign value of num2 to num 1 so 16=16 because = is assigment operator
		System.out.println(num1);
		System.out.println(num1==num2);// == means equal to (comparing)
		System.out.println(num1!=num2); //!= means not equal to
  // 
	}

}

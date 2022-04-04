package com.syntax.class03;

public class ShorthandOperators {

	public static void main(String[] args) {
		// +,-,*,/,%
		// "=" is assignment operator. First operation happens example below

		int num = 100;
		num = num + 100;
		System.out.println(num);

		num += 100; // this exact means ==> this num=num+100;
		System.out.println(num);// 300

		num -= 20;
		System.out.println(num); // 280

		num /= 10;// shorter way of num=num/10
		System.out.println(num);// 28

		num %= 3;// remainder operators
		System.out.println(num); // 1

		/*
		 * 1.Declare variable and increase it’s value by 500 and then by 200 using
		 * shorthand operator
		 * 2.Declare variable and decrease it’s value by 60 using shorthand operator
		 * 3.Declare variable cakePiece=11 and divide the value of that variable between 4
		 * people using shorthand operator 
		 * 4.Declare variable cake=25 and divide cake between 7 people .
		 *  Using shorthand operator found out how many pieces of cake 
		 *  left after it was distributed equally among 7 people 
		 */
		//number 1
      int  num1=100;
      num1+=500;
      num1+=200;
      System.out.println(num1);
      //number 2
      int num2=200;
      num2-=60;
      System.out.println(num2);
      //number 3
     int cakePiece=11;
     cakePiece/=4;
     System.out.println(cakePiece);
     //number 4
     int cake=25;
     cake/=7;
     cake%=7;
     System.out.println(cake);
     
      
     
      
	}

}

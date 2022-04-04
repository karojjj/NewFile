package com.replit.exercises;

public class ReplitPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean isTrue=true;
		boolean isFalse=false;
		System.out.println(isTrue);
		System.out.println(isFalse);
		
		int age=4;
		System.out.println(age);
		
		boolean  myBoolean=false;
		double money=9999.99;
		System.out.println(money+"false");
		
		String a="*";
		String b="**";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a+b);
		String c="#";
		String d="##";
		System.out.println(c);
		System.out.println(d);
		
		
		String name="chen";
		int age1=50;
		String iq="50";
		System.out.println(name);
		System.out.println(age1+iq);

		String name1="John";
				;
		String lastName=" Smith";
		System.out.println(name1+lastName);
		
		String x="Java"
				;
		String y="programming language";
		
		System.out.println(x + " is the #1 "+ y);
		
		String z="syntax";
		String e=".com";
		System.out.println(z+e);
		
		
		float m=8.2f;
		float n=m*m;
		System.out.println("The multiplication of " + m + " with itself is equal to " +n );
		
		int k=200;
		int l=100;
		System.out.println(k+l);
		System.out.println(k-l);
		System.out.println(k*l);
		System.out.println(k/l);
		
		//mod examples "it is remainder %
		
		//Print the results of 14 mod 2.
		 int s=14;
		 int t=2;
		 int mod=s%t;
		 System.out.println(mod);
		
		// Print the result of 29 mod 4
		 int num11=29;
		 int num12=4;
		 System.out.println(num11%num12);
		 
		 // Print result of -21 mod 4?
		 
		 int num13=-21;
		 int num14=4;
		 System.out.println(num13%num14);
		 
		 /*Math Magic
		 In this project, you will become a magician and write a small program that performs a mathematical magic trick! It will involve performing arithmetic operations on an integer that you created.

		 For you to do:

		 Create an int variable called myNumber. Set it equal to any number other than 0.
		 We will refer to myNumber as the original number from now on.
		 Create an int variable called stepOne. Set it equal to the original number (myNumber) multiplied by itself.
		 Create an int variable called stepTwo. Set it equal to the previous result (stepOne) plus the original number (myNumber).
		 Create an int variable called stepThree. Set it equal to the previous result (stepTwo) divided by the original number.
		 Create an int variable called stepFour. Set it equal to the previous result (stepThree) plus 17.
		 Create an int variable called stepFive. Set it equal to the previous result (stepFour) minus the original number.
		 Create an int variable called stepSix.Set it equal to the previous result (stepFive) divided by 6.
		 Let's print out the value of the last step as: "The magic number is _ !"
		 Now try running your code! What number is printed to the console?

		 Now, go back to your code and change myNumber to any other integer.

		 Run your program again.

		 Is the output the same?

		 It's math magic! */
		 
		 
		 int myNumber=5;
		 int stepOne=myNumber*myNumber;
		 int stepTwo=stepOne+myNumber;
		 int stepThree=stepTwo/myNumber;
		 int stepFour=stepThree+17;
		 int stepFive=stepFour-myNumber;
		 int stepSix=stepFive/6;
		 System.out.println("The magic number is "+stepSix);
		 
		 
	}

}
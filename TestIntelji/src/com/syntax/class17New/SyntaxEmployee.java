package com.syntax.class17New;

public class SyntaxEmployee {
	String empID; //INSTANCE
	double salary; //instance
	static String CEO="Sumair"; //static variable
	

	public static void main(String[] args) {
		/*
		 * create a class called SyntexEmployee.
		 * Create three variables empID, salary, and set the CEO to "sumair"
		 * create two objects of the class Employee
		 * set the value of empID , salary, for each of the objects
		 * print out empID  , salary and CEO for each of the objects
		 */
		
		SyntaxEmployee emp1=new SyntaxEmployee(); //local variable
		emp1.empID="123";
		emp1.salary=100.000;
	
		System.out.println(emp1.empID);
		System.out.println(emp1.salary);
		System.out.println(SyntaxEmployee.CEO);
		System.out.println("___________________");
		SyntaxEmployee emp2=new SyntaxEmployee();
		emp2.empID="123646466";
		emp2.salary=300.000;
	
		System.out.println(emp2.empID);
		System.out.println(emp2.salary);
		System.out.println(SyntaxEmployee.CEO);
		

	}

}

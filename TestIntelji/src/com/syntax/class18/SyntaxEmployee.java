package com.syntax.class18;

import java.io.PrintStream;

public class SyntaxEmployee {
String empId; //instant
double salary; //instant
static String CEO="Sumair"; //static
	public static void main(String[] args) {
		
		SyntaxEmployee aselObject=new SyntaxEmployee();
		aselObject.empId="123";
		aselObject.salary=200000;
		System.out.println(aselObject.empId);
		System.out.println(aselObject.salary);
	    System.out.println(SyntaxEmployee.CEO);
	    System.out.println("_______________________________");
	    
	    SyntaxEmployee mozzamObject=new SyntaxEmployee();
	    mozzamObject.empId="456";
	    mozzamObject.salary=198000;
	    System.out.println(mozzamObject.empId);
		System.out.println(mozzamObject.salary);
	    System.out.println(SyntaxEmployee.CEO);

	}

}

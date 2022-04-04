package com.replit.exercises;

public class Replit142SyntaxTechnologies {
   //class variables:
	String schoolName;
	int batch;
	int year;
	String lastDayOfClass;
	//non argument constructor
	Replit142SyntaxTechnologies(){
		
	}
	//parameterized constructor
	Replit142SyntaxTechnologies(String schoolName, int batch, int year, String lastDayOfClass){
		this.schoolName=schoolName;
		this.batch=batch;
		this.year=year;
		this.lastDayOfClass=lastDayOfClass;
	}
	// calling  display method
	void display() {
		System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	}
	}



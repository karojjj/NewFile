package com.replit.exercises;

public class Replit142 {
   //class variables:
	String schoolName;
	int batch;
	int year;
	String lastDayOfClass;
	//non argument constructor
	Replit142(){
		
	}
	//parameterized constructor
	Replit142(String schoolName, int batch, int year, String lastDayOfClass){
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



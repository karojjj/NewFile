package com.replit.exercises;

public class Replit87 {
	String carColor;
	int carYear;
	String carMake;
	void printCompleInfo(){
	 System.out.println("Car color is "+carColor+" and car year is "+carYear+" and car model is "+carMake);
	}
	public static void main(String[] args) {
		/*
		 * Create a class named 'Main' with specific attributes.
		 * Create two objects of that class in which you will be assigning the following
		 * values and then print them.
		 * carColor='Black'
		 * carYear=2019
		 * carMake='BMW'
		 * carColor='White'
		 * carYear=2018
		 * carMake='Toyota'
		 * Expected Output:
		 * Car color is Black and car year is 2019 and car model is BMW 
		 * Car color is White and car year is 2018 and car model is Toyota
		 */
		
		 Replit87 bmw=new Replit87();
		  bmw.carColor="Black";
		  bmw.carYear=2019;
		  bmw.carMake="BMW";
		  bmw.printCompleInfo();

		  Replit87 toyota=new  Replit87();

		  toyota.carColor="White";
		  toyota.carYear=2018;
		  toyota.carMake="Toyota";
		  toyota.printCompleInfo();


	}

}

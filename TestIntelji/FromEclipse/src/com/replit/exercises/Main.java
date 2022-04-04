package com.replit.exercises;

public class Main {
 String carColor;
 String carMake;
 int carYear;
 void printCompleInfo() {
	 System.out.println("Car color is "+carColor+" and car year is "+carYear+" and car model is "+carMake);
 }
 
	public static void main(String[] args) {
		/*REPLIT87
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
		 * Car color is Black and car year is 2019 and car model is BMW Car color is
		 * White and car year is 2018 and car model is Toyota
		 */
		
		Main obj1=new Main(); //creating obj1 class
		Main obj2=new Main(); //creating obj2 class
		
		obj1.carColor="Black";
		obj1.carYear=2019;
		obj1.carMake="BMW";
		obj1.printCompleInfo();
		
		obj2.carColor="White";
		obj2.carYear=2018;
		obj2.carMake="Toyota";
		obj2.printCompleInfo();
	}

}

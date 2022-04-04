package com.syntax.class13;

public class MethodsDemo3 {
	
	/*
	 * int we specify the datatype that method will return squareTheNumber name of
	 * the method, (int number)parameters of the method return tell java what to
	 * return from this method
	 */
	int squareTheNumber(int number) { //creating an int method

		return number * number;
	}
	int returnTheSameNumber(int number) {
		return number;
	}
	String getProperAnimalByExpert(String expertName, String animalName) {
		if ("Teyfur".equalsIgnoreCase(expertName) &&"Horse".equalsIgnoreCase(animalName)) {
			return "Camel";
		} else if("Horse".equalsIgnoreCase(animalName)) {
			return "Horse";
		} else {
			return "I do not know";
		}
	}
  // create a method that takes a person name and an animal name
	//if person name is "Teyfur"and if animal is "Horse" it returns us "Camel"
	public static void main(String[] args) {
		
    MethodsDemo3 obj=new MethodsDemo3(); //object creation
    
    int result=obj.squareTheNumber(5); //we are calling method here
    System.out.println(result); //printing the method 
	int med=obj.returnTheSameNumber(6);
	System.out.println(med);
	System.out.println(obj.getProperAnimalByExpert("Teyfur", "Horse"));	
	System.out.println(obj.getProperAnimalByExpert("Tamer", "Monkey"));
		
	}
}


	
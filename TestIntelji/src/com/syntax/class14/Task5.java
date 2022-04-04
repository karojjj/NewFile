package com.syntax.class14;

public class Task5 {
	boolean isPrime(int number) { // creating a boolean method to check prime number,

		boolean isPrime = true; // we initialized our boolean value to true
		if (number > 1) { // checking if number prime or not
			for (int i = 2; i < number; i++) { // prime number starts with to and u can not divide two and more only can
												// be dividible to itself
				if (number % i == 0) {  // so here is if number result is 0 ewhen u divide it is not prime
					isPrime = false;
					break;
				}
			}
		} else {
			isPrime = false;
		}
		return isPrime; 
	}

	public static void main(String[] args) {
		// write a method to return whether given number is prime or not

		Task5 object = new Task5(); //creating class object
		System.out.println(object.isPrime(12)); //calling the method 

	}

}

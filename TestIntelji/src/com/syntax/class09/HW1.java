package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		// Create an array of cars and store 6 elements into it. Using 2 different loops
		// print all values from the array.
		String[] cars = { "BMW", "Toyota", "Ferrari", "Honda", "Jaguar", "Nissan" };
     /// for each loops
		for (String brands : cars) {
			System.out.print(brands + "   ");

		}
		
		//for classic loops
		System.out.println();
		for (int i = 0; i <cars.length; i++) {
			System.out.print(cars[i] + "   ");
		}
	}

}

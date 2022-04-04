package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// array: collection/group.container of values same data type.Values inside
		// array called elements.Elements inside array stored based on indexes.First
		// index in array starts from 0
		// if we know # of repetitoons use for loop
		//if we do not know # of repetitons use while loop

		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		System.out.println(numbers[2]); // 0
		// System.out.println(numbers[3]); //Index 3 out of bounds for length 3 because
		// we did noy specify numbers[3
		System.out.println("--------------------------------------");
		String[]  weather= {"hot", "cold","rainy","cloudy", "snow"};
		System.out.println(weather[4]);
	}

}

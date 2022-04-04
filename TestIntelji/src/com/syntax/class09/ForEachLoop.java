package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		// if you have an array you can use for each loop to iterate/loop through the
		// entire array
		String[] cities = { "Washington DC", "Boston", "Miami", "Los Angeles", "New York" };
		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println("--------------------------------------------------------------------");
		int[] numbers = { 10, 20, 30, 40 };
		for (int num : numbers) {
			System.out.println(num);
		}
		System.out.println("--------------------------------------------------------------------");

		char[] grades = { 'A', 'B', 'C', 'D' };

		for (char grade : grades) {
			System.out.print(grade + "  ");
		}
		System.out.println("--------------------------------------------------------------------");
		String[] countries = { "Turkey", "Spain", "Italy", "Germany" };
		for (String country:countries) {
			System.out.print(country+"   ");
		}

	}
}

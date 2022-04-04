package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
		// From an array of integer elements find the largest number.

		int[] number = { 23, 34, 45, 32, 123, 978, 98, 0, 2 };
		int largest = number[0];
		for (int i = 0; i < number.length; i++) {

			if (number[i] > largest) {
				largest = number[i];
			}

		}
		System.out.println(largest);

		largest = number[0];
		for (int num : number) {
			if (num > largest) {
				largest = num;

			}
		}
		System.out.print(largest);
	}
}
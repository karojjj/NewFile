package com.syntax.class07;

public class IncrementAndDecrement {
	public static void main(String[] args) {
		int num = 10;
		num = num + 1;
		num += 1;
		num++;

		System.out.println(num); // 13
		// increment operator add 1 to a variable
		num++;
		System.out.println(num);
		// 10++; CE:INVALID ARGUMENT TO OPERATION ++/==
		// DECREMENR OPERTOR SUBTRACT FROM A VARIABLE
		num--;
		num--;
		num--;
		System.out.println(num);

	}
}
package com.syntax.class12;

import java.util.Scanner;

public class CalculatorTester {
	public static void main(String[] args) {

		Calculator simpleMathCalculator = new Calculator();
		simpleMathCalculator.add();
		Scanner scanner = new Scanner(System.in);

		simpleMathCalculator.addNumbers(10, 25);
		simpleMathCalculator.addNumbers(30, 30);

		int number1 = 50;
		int number2 = 50;

		simpleMathCalculator.addNumbers(number1, number2);

	}

}

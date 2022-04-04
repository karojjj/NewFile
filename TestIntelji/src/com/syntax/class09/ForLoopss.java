package com.syntax.class09;

public class ForLoopss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 2; i++) {
			for (int j = 1; j <= 2; j++) {
				if (j == 2) {
					continue;
				}
				System.out.println("Good Morning");
			}
			System.out.println("Hello");
		}

	}
}

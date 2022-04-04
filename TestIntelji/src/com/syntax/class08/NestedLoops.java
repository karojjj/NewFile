package com.syntax.class08;

public class NestedLoops {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) {
			System.out.println("I am a i loop " + i);
			for (int j = 1; j <= 2; j++) {
				System.out.println("I am nested j loop " + j);
			}
		}
		System.out.println("ANOTHER EXAMPLE SEE BELOW");
		for (int i = 1; i <= 4; i++) {
			System.out.println(i);
			for (int j = 1; j < 3; j++) {
				System.out.println(j);

			}
			System.out.println("--------------------------");
		}

	}
}

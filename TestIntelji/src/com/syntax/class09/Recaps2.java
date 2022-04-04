package com.syntax.class09;

public class Recaps2 {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) { // outer loop controls number of complete iteration of inner loop
			for (int j = 1; j <= 3; j--) { // Inner loops always depends on outer // when we print code does not stop thats why we need to use break;
											// because j--

				System.out.println("Hello"+i); //
				break;
			}
			System.out.println("Good Morning"+i);
		}

	}
}
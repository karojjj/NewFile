package com.syntax.class09;

public class RecapofClass8 {

	public static void main(String[] args) {
		// nested loops
		// break=breaks the loop
		// contunie=skipes the current iteration
		for (int i = 1; i <= 4; i++) {
			System.out.println("A");
			// break;
			System.out.println("B");
		}

		// nested loop for LOOP
		System.out.println("-----------------------------------------------------");
		for (int i = 1; i <= 3; i++) { // outer loop controls number of complete iteration of inner loop
			for (int j = 1; j >= 3; j++) { // Inner loops always depends on outer // burda condition yanlis 1>=3 den o
											// oyuzden hello print etmyr

				System.out.println("Hello");
			}
			System.out.println("Good Morning");

		}

		System.out.println("-----------------------------------------------------");
		for (int i = 1; i <= 3; i++) { // outer loop controls number of complete iteration of inner loop
			for (int j = 1; j <= 3; j++) { // Inner loops always depends on outer

				System.out.println("Hello");
			}
			System.out.println("Good Morning");
		}

		System.out.println("-----------------------------------------------------");
		for (int i = 1; i <= 3;) { // outer loop controls number of complete iteration of inner loop
			for (int j = 1; j <= 3; j++) { // Inner loops always depends on outer
				System.out.println("Hello");

			}

			System.out.println("Good Morning");
			break; // burda koyarsak sadece bi kere print edecek hello koduna girmeyeck. cunku bu kod outer loopa bagli
			
		}
		System.out.println("-----------------------------------------------------");
		for (int i = 1; i <= 3; i++) { // outer loop controls number of complete iteration of inner loop
			for (int j = 1; j <= 3; j++) { // Inner loops always depends on outer
				System.out.println("Hello");
				break; 
			}

			System.out.println("Good Morning");
		    break;
	}
}
}
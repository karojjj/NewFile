package com.syntax.class09;

public class Recaps1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 3; i++) { // outer loop controls number of complete iteration of inner loop
			for (int j = 1; j >= 3; j++) { // Inner loops always depends on outer // 

				System.out.println("Hello"+j+" "); // it did not print because j>=3 is false statement 1>=3 not correct
			}
			System.out.println("Good Morning"+" ");
	}

}
}
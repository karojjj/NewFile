package com.syntax.class09;

public class Recaps {

	public static void main(String[] args) {
		for (int i = 1; i <= 3; i++) { // outer loop controls number of complete iteration of inner loop
			for (int j = 1; j <= 3; j++) { // Inner loops always depends on outer // 

				System.out.print("Hello"+j+" ");
			}
			System.out.print("Good Morning"+" ");
			  System.out.println("------------------------------------------------------------");
		}
          
	}

}

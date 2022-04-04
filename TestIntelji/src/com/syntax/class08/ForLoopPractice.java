package com.syntax.class08;

public class ForLoopPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 11; i <= 13; i++) {

			System.out.println("hello " + i);

		}
		System.out.println(" MULTIPLICATION TABLE ");
		/*
		 * 3 X 1=3 3 X 2=6 UNTIL
		 * 
		 * 3 X 10=30
		 */

		int num = 3;
		int result;
		for (int i = 1; i <= 10; i++) {
			result = num * i;

			System.out.println(num + " X " + i + " = " + result);
		}
		System.out.println(" ==================================");

		for (int i = 0; i <= 10; i += 3) { // 0 dan 10 a kadar olan sayilari uc uc artirkdk incremente += isareti ve
											// eklmek istedgn sayiyi yaz
			System.out.print(i + " ");
		}

		System.out.println(" =====================================");

		int sum = 0;        
		for (int i = 1; i <= 5; i++) { 
			sum += i;
			System.out.println(sum);

		}

		

		System.out.println("------------------------------");
		/*
		 * For you to do:
		 * 
		 * Create a for loop that prints out odd numbers from 5 to 22
		 * 
		 * Must not include the number 22 in the output
		 */
		int odd = 22;
		for (int i = 5; i <= 22; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		
		
			
			
		
		}
	}

}

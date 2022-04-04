package com.syntax.class07;

public class Example4 {

	public static void main(String[] args) {

		// print only even numbers from 1 to 30

		int d = 2;
		while (d <= 30) {

			System.out.print(d + " ");
			d += 2;

		}
		System.out.println(" another way to print even numbers from 1 to 30");
		
		//alternative way to do it, see below example
		
		int d1=1;
		while (d1<=30) {
			if (d1%2==0) {
			System.out.print(d1+" ");
		
			}
			d1++;
				
			}
		
		}
	}



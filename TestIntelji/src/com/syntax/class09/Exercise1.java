package com.syntax.class09;

public class Exercise1 {

	public static void main(String[] args) {
		// create an array and retrieve all elements in reverse order
		
	int [] numbers= {10, 20, 30, 40, 50, 60};
	for (int i=0; i<numbers.length; i++) {
		System.out.println(numbers[i]);
	}

	
	for (int i=numbers.length-1; i>=0; i--) {
		System.out.println(numbers[5]);
	}
	System.out.println("Another way");
	int[] num= {45,23, 15,30};
	for (int i=0; i<num.length; i++) {
		System.out.print(num[num.length-i-1]+" ");
	}
	}

}

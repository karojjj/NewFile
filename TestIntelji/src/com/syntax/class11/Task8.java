package com.syntax.class11;

public class Task8 {

	public static void main(String[] args) {
		/*
		 * Maximum and minimum number in the array?
		 */
			int[] arr= {10,20,90,50,70};
			int largest=arr[0];////assuming first number is the largest number
			int smallest=arr[0];//assuming first number is the smallest number
			
			//iterating through all the elements
			for(int elements:arr) {
				//checking if we have something even bigger if yes update the largest
				if(elements>largest) {
					largest=elements;
				}
				//checking if we have something even smaller if yes update the smallest
				if(elements<smallest) {
					smallest=elements;
				}
			}
			System.out.println("Largest number is "+ largest);
			System.out.println("Largest number is "+ smallest);
			
		}}
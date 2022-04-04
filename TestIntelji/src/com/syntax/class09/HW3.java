package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		// Create an array on integers and calculate the sum of all elements in an array
		
		int[] numbers = { 10, 20, 30, 40, 50, 60, 70 };
		int sum=0;
	
		int size=numbers.length;
	
        for (int i=0; i<size; i++) {
        	sum+=numbers[i];
        		
        }
        System.out.println("sum of all element in an array ="+ sum);
        
       // enhance for loop
        sum=0;
       for (int num:numbers) {
        	sum+=num;
        	
       }
       System.out.println("sum of all element in an array= "+sum);
	}
}
        	
        
	



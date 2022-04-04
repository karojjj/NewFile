package com.myinternet.study;

public class ForLoop {

	public static void main(String[] args) {
		// for(initialization; condition; increment/decrement){    
		//code to be executed    
	   
    
		
		for (int i=1; i<=6; i++) {
			
			for (int j=6; j>=i; j--) {
				
				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}

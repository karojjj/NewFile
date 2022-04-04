package com.myinternet.study;

public class TwoDarray {

	public static void main(String[] args) {
		// how to print all numbers from 2D arrays by using nested for loops?

		int [][] lotteryCard= { {20, 15,7}, {8,7,19}, {7,13, 47} };
		
		for (int i=0; i<lotteryCard.length; i++) {
			for (int j=0; j<lotteryCard.length; j++) {
			
			System.out.print(lotteryCard[i][j]+" ");
		
		}
			System.out.println(" ");
	
	}		
		}
}

package com.replit.exercises;

public final class Replit85 {

	public static void main(String[] args) {
		// Write a program that sums all numbers that are on even index and on even row.
		// output=-4

		int[][] a = { { -5, -2, -3, 7 }, { 1, -5, -2, 2 }, { 1, -2, 3, -4 }

				// even index: {1,-2,3,-4}
				// even row:{-3,-2,3}
		//start coding from here
		};
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i % 2 == 0 && j % 2 == 0) {
					sum += a[i][j];
				}

			}

		}
		System.out.println(sum);
	}
}
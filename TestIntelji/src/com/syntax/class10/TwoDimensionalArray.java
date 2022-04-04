package com.syntax.class10;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		// 2D Arrays
		int[][] numbers = new int[3][5];

		// 1 Row
		numbers[0][0] = 10;
		numbers[0][1] = 12;
		numbers[0][2] = 43;
		numbers[0][3] = 11;
		numbers[0][4] = 22;
		// 2 row
		numbers[1][0] = 20;
		numbers[1][1] = 45;
		numbers[1][2] = 56;
		numbers[1][3] = 1;
		numbers[1][4] = 33;
        // 3Row
		numbers[2][0] = 20;
		numbers[2][1] = 45;
		numbers[2][2] = 56;
		numbers[2][3] = 1;
		numbers[2][4] = 33;
		
		System.out.println(numbers[1][0]);
	}

}

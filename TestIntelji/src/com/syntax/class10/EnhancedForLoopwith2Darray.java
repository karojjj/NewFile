package com.syntax.class10;

public class EnhancedForLoopwith2Darray {

	public static void main(String[] args) {
		

		
		int p[][]= {
				{5,6,7, 8},
				{6,7,8,9},
				{9,8,7,6}
		};
		
		for (int i[]:p) {
			for(int j:i) {
			System.out.print(j+" ");
			
		}	
	}
}
}

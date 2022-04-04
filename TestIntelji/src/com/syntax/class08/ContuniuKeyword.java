package com.syntax.class08;

public class ContuniuKeyword {

	public static void main(String[] args) {
		 for (int i=1; i<=5; i++) {
			
			 if (i==3) {
				 continue; //skip current iteration/cycle
			 }
			 System.out.println("hello"+i);
			 System.out.println("we are batch 12");
		 }
// print all numbers from1 to 10 except number 4 and  7
		 for (int i=1; i<=10; i++) {
			 if (i==4 || i==7) {
				 continue;
			 }
				System.out.print(i+" ");
		 }
		
	
	}

}

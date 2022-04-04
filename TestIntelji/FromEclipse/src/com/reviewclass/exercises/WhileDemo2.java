package com.reviewclass.exercises;

public class WhileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=0;
		//x+=5; basa koyarsak x degerimiz 5 olacak condition is not correct 5<2
		while (x<2) {
			System.out.println("Hello Batch 12");
			x+=10; 
			 //x+=2; becuse we increase x +2 so once time it will execute the code
			 // x-=5; infinitive loop
		
		}

	}

}

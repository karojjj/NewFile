package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		for (int i=1; i<5; i++) {
			System.out.println("I am code inside for loop");
			if(i==3) {
			break;
			//without break; the code will execute three times but if we use break it will break code so it will execute one time
		}
		System.out.println("end of the code");
		boolean winter=true;
		int temp=0;
		while(winter) {
			System.out.println("it is cold :)");
			if (temp==20) {
				
				break;
			}
			temp+=5;
		}
	}

	}

}

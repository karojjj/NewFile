package com.syntax.class07;

public class FoorLoopMultp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=1;
		for(int x=0; x<4; x++) {       // yoour initialization is "0" thats why when u multiply with 0 your result will be zero
			value*=x;
		}
		System.out.println(value);
		System.out.println("-----------------");
		int num=1;
		for ( int i=1; i<4; i++) {
			num*=i;
			System.out.println(num);
		}
	}
       
}

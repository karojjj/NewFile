package com.myinternet.study;
import java.util.Scanner;
public class PatternExample {

	public static void main(String[] args) {
		System.out.println("hello how many stars would u like to have ?");
		Scanner star=new Scanner(System.in);
		int numofstar=star.nextInt();
		for (int i=1; i<=numofstar; i++) {   //gives us rows
			for( int j=0; j<i; j++) {  // give us column
			System.out.print("*");
		}
      System.out.println();
	}
    for (int i=numofstar; i>0; i--) {
    	for( int j=0; j<i; j++) {  // give us column
			System.out.print("*");
    }
    	System.out.println();
	}}}

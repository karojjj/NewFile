package com.myinternet.study;
import java.util.Scanner;
public class LoopForEachCharacter {

	public static void main(String[] args) {
		// create a string
		
		Scanner input=new Scanner(System.in);
		System.out.println("In:");
	
		String word=input.nextLine();
		
	
		//loop through each element
		for (int i=0; i<word.length(); i++) {
			//access each character
			char a=word.charAt(i);
			System.out.println(a+" ");
		}

	}

}

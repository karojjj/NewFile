package com.syntax.class04;
import java.util.Scanner;
public class IfElseDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner med=new Scanner(System.in);
		System.out.println("Add a num");
		int num=med.nextInt();
		
		if (num == 10) {
			System.out.println("num is 10");
		} else if (num == 15) {
			System.out.println("num is 15");
		} else if (num == 20) {
			System.out.println("num is 20");
		} else {
			System.out.println("add correct num");
		}
		
		}
	}



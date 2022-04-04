package com.syntax.class05;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		/*
		 * Write a program that will print whether it is a weekend or weekday. If any
		 * day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a
		 * weekend”, any other day → output “Invalid day”
		 */
		Scanner med = new Scanner(System.in);
		System.out.println("Enter a number ");
		int day = med.nextInt();
        if (day>=1 && day<=5) {
        	System.out.println("It is a weekday");
        } else if (day>=6 && day<=7) {
        	System.out.println("It is a weekend");
        } else {
        	System.out.println("Invalid Day");
        }
                System.out.println("--------------");
                
                
           //alternative way to do it..
                if( day==1 ||day==2 ||day==3|| day==4 || day==5) {
                	System.out.println("It is a weekday");
                }else if ( day==6 || day==7) {
                	System.out.println("It is a weekend");
                }else {
                	System.out.println("Invalid day");
                }
	}

}


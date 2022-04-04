package com.replit.exercises;
import java.util.Scanner;
public class Replit100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner input=new Scanner(System.in);
               System.out.println("In:");
               String s=input.nextLine();
               
               //write your code below
               String reverse="";
               int length=s.length();
               for (int i=length-1; i>=0; i--){
            	   reverse=reverse+(s.charAt(i));
            	  
               }
               System.out.println(reverse);
	}

}

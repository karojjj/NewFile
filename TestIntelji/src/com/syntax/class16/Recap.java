package com.syntax.class16;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is my #0345685967 Tarik";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(3));
		System.out.println(str.length()); //it gives length [characters] of string 
		System.out.println(str.charAt(str.length()-1)); // it returns last letter of string 
		System.out.println("*******************************");
		
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println("***************");
		
		System.out.println(str.indexOf("#")); //11
	
		System.out.println(str.substring(str.indexOf("#")+1)); //12
		System.out.println(str.substring(12, 23));
		
		System.out.println(str.substring(str.indexOf("#")+1, str.indexOf("#")+1+10));
	}

}

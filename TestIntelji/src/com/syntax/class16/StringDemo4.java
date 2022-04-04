package com.syntax.class16;

public class StringDemo4 {

	public static void main(String[] args) {
		//reverse method
		String s="Ashgar is great";
		System.out.println(s.replace(" ", " "));
		System.out.println(s);
		
		
		StringBuilder stringBuilder=new StringBuilder ("Ashgar is great");
		System.out.println(stringBuilder.reverse());
		System.out.println(stringBuilder);
		
	
		 String s1= new String("Asghar Is Great"); //original string
		    s1.concat("hahah"); //add new String hahha to the original string
		    System.out.println(s1); //printing out the original string

		    StringBuilder stringBuilder1=new StringBuilder("Asghar Is Great");//original string
		    stringBuilder1.append("Hahha"); //add new String hahha to the string
		    System.out.println(stringBuilder1); //printing out the original string
		}
	}



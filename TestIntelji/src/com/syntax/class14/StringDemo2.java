package com.syntax.class14;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String name="               Medine Kaya              ";
		System.out.println(name);
		System.out.println(name.trim()); // it removes space from before or after the character
       String name1="Run Arin";
       
       System.out.println(name1.toLowerCase().startsWith("run"));  //method chaining
       System.out.println(name1.startsWith("Med"));// it is boolean value it check if the string start with ..
       System.out.println(name1.toUpperCase().endsWith("arin"));// cunku son kelime arin ile bitio o yuzden dogru
      System.out.println(name1.toLowerCase().contains("M"));
      
       
	}

}

package com.syntax.class16;

public class Task2 {

	public static void main(String[] args) {
		// create a string that should be combination of letters , numbers and speacial
		// characters.find out how many alpha characters are there in the string
		//alpha characters:  is a term that encompasses all of the letters and numerals in a given language se
		
         String s="12345!@#$%^&esdASDSF8347488";
        System.out.println(s.length());
        System.out.println(s.replaceAll("[A-Za-z0-9]", "").length());
        
        
         
	}

}

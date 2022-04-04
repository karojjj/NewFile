package com.myinternet.study;

public class CountCharacterofString {

	public static void main(String[] args) {
		String string="Medine arini cok seviyor, en sevdigi simarik kedisi";
		int count=0;
		//count each character except space
		for (int i=0; i<string.length(); i++) {
			 if(string.charAt(i) != ' ')    
				count++;
		}
		  //Displays the total number of characters present in the given string    
        System.out.println("Total number of characters in a string: " + count);    
	}

}

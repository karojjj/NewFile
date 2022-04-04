package com.syntax.class14;

public class StringDemo1 {

	public static void main(String[] args) {
	
		String name = "Medine"; // always use this one it is shorter.
		String name2 = new String("Medine  Kaya  ");

		System.out.println(name);
		System.out.println(name2);
		System.out.println(name.length()); //returns int type method
		System.out.println(name2.length()); // it also calculates the space
		System.out.println(name.charAt(2));
		System.out.println(name2.toLowerCase());
		System.out.println(name2.toUpperCase());

		// name=null;
		System.out.println(name+name2); //you should always prefer this method to
		// perform concatenation
		System.out.println(name.concat(name2)); //concat mean combines two strings
		name = "            ";
		System.out.println(name.isEmpty());// it checks if the string is empty or not
		/// isBlank(); does not care spaces but isEmpty(); cares spaces
		
	}

}

package com.syntax.class18;

public class ClassTask2 {
 public static String reverseString(String input) {   //Create a method that will take a String as a parameter
	
	/* StringBuilder stringBuilder=new StringBuilder(input);
	stringBuilder.reverse();  //
	return  stringBuilder.toString();
	 another way*/
	 //short way 
	 return new StringBuilder(input).reverse().toString();
	 //  new StringBuilder(input)==> object creation
	 // new StringBuilder(input).reverse()==> calling a method on that object
	 // new StringBuilder(input).reverse().toString();==> calling two methods on that object
	 // return new StringBuilder(input).reverse().toString();==> calling to methods on that object and returning the results
 }
	
	public static void main(String[] args) {
		// Create a method that will take a String as a parameter and returns reversed
		// String. Method should be available to all classes within your project and
		// accessible by class name also.
		String name="Emili";
		System.out.println(ClassTask2.reverseString(name));

	}

}

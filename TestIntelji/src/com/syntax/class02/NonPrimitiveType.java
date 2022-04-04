package com.syntax.class02;

public class NonPrimitiveType {

	public static void main(String[] args) {
	
      /*string is a data type part of non primitive types. It starts upper case String
       * can be any value
       * string is a class
       * string is not key word
       */
		
		String name="Medine";
      String lastName="Kaya";
      String mobileNumber="570-874-9111";
      String num="123";
      String greeting="Hello Friend";
      System.out.println(greeting);
      System.out.println("Hello Friends");
      System.out.println(name);
      
      //syso+ctrl+space-->autocomplete print statement  or System.out.println();
     
      System.out.println(mobileNumber);
      System.out.println("mobile number");
      System.out.println(num);
      //when you have two string variable, you can combine or create two variables add"+"
      //
      System.out.println(name+lastName);
      System.out.println(name+" "+lastName); //you can add space like this way
      /*using "+" sign we can concatenate
       * String +String'
       * String + int
       * String +boolean
       * String + double, char etc..
       */
     // Medine is 30 years old
      int age1=30;
      
      System.out.println(name+" is " +age1 + " years old " );
      
      //I live on 449 sea street
      String address="449 sea street";
      System.out.println("I live on "+address);
      
      
      //I like kebab
      String feeling = "like";
      
      String food = "Kebab";
      
      System.out.println("I "+feeling+" "+food);
     System.out.println("I want to eat " +food);
    
     feeling="love";
     food="shrimp";
     System.out.println("I changed my mind and now I want to eat " +food);
	 System.out.println("who does not like " +food);
	System.out.println("I " +feeling+"     "+ food);
	
	
	
	}

}

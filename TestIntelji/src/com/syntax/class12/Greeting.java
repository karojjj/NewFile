package com.syntax.class12;

public class Greeting {
	
	void sayHello(String name) {
		System.out.println("Hello " + name); //printing one time
	}
	
  void sayHelloManyTimes(String name) { // printing five times 
	 for (int i=0; i<5; i++) {
		 System.out.println("Hello "+name);
	 }
  }
   void sayHelloNumberOfTimes(String name, int times) {
	   for (int i=0; i<times; i++) {
		   System.out.println("Hello "+name);
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Greeting greeter=new Greeting();
     greeter.sayHello("Tarik");
     greeter.sayHelloManyTimes("Emilia");
     greeter.sayHelloNumberOfTimes("Medine", 2);// printing two times we have int inside our method(
   
	}

}

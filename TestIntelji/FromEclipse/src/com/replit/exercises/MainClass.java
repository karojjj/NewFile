package com.replit.exercises;

public class MainClass {

	String breed;
	String name;
	String color;
	
	
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+" can run");
	}
	void play() {
		System.out.println(name+" can play");
		
	}
	
	public static void main(String[] args) {
		/*
		 * REPLIT88 Create a Class MainClass
		 * 
		 * In this class, you should specify the following attributes: breed, name,
		 * color, and following behaviors: bark(), run(), play().
		 * 
		 * Create 3 different objects of it: Husky, Bulldog, Labrador with specific
		 * attributes and behaviors.
		 * 
		 * The output of the program should be as following:
		 * 
		 * Husky can bark Husky can run  Husky can play
		 * Bulldog can bark Bulldog can run  Bulldog can play
		 * Labrador can bark  Labrador can run  Labrador can play
		 */
         MainClass dog1=new MainClass();
         MainClass dog2=new MainClass();
         MainClass dog3=new MainClass();
         
         dog1.name="Husky";
         dog1.breed="Siberian";
         dog1.color="White";
         dog1.run();
         dog1.bark();
         dog1.play();
         
         dog2.name="Bulldog";
         dog2.breed="American";
         dog2.color="White";
         dog2.run();
         dog2.bark();
         dog2.play();
         
         dog3.name="Labrador";
         dog3.breed="Biritish";
         dog3.color="Brown";
         dog3.run();
         dog3.bark();
         dog3.play();
         
         
         
	}

}

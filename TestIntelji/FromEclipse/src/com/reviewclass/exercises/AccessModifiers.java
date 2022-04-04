package com.reviewclass.exercises;

public class AccessModifiers {
	private String name="Something something";
	int age=50; //default access
	protected double weight=50;
	public String color="white";
	

	public static void main(String[] args) {
		AccessModifiers am=new AccessModifiers();
		System.out.println(am.name);
		System.out.println(am.age);
		System.out.println(am.color);


	}

}

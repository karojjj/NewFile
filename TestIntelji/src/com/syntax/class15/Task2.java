package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
	String name="how are you guys @";
	System.out.println(name.charAt(0));//index starts with zero the first letter h so we can see "h" on console
	System.out.println(name.charAt(6));//e
	System.out.println(name.charAt(3));// space , also it counts space!
	System.out.println("-----------------------------");
	//write a lopp to print all the characters of a string
	for (int i=0; i<name.length(); i++) {
		System.out.print(name.charAt(i)+"_");
	}

	}

}

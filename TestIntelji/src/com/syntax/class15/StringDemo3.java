package com.syntax.class15;

public class StringDemo3 {

	public static void main(String[] args) {
		String name = "How are @you guys @ camel";
		System.out.println(name.lastIndexOf("@"));// 17
		System.out.println(name.lastIndexOf("are"));// 4

		System.out.println(name.lastIndexOf("guys"));
		System.out.println(name.indexOf(name));
		System.out.println(name.indexOf("@"));
		System.out.println(name.indexOf("horse"));// -1
		System.out.println(name.indexOf("$"));// character is not in the present in the string thats why we got -1
		System.out.println(name.indexOf("@"));// 8
		System.out.println(name.indexOf("@", 8+1));
		System.out.println(name.indexOf("@", name.indexOf("@") + 1));// 18 //the first index give 8 but we want to
																		// callculate the second @ so thats why we added
																		// one it gives us @ which index 18

	}

}

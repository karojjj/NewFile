package com.syntax.class13;

public class Homework5 {
	
	 String isPrime(int num) {

		if (num > 1) {
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					return num + " is not a prime number";
				}
			}

		} else {
			return num + " is not a prime number";
		}
		return num + " is prime number";

	}
	       public static void main(String[] args) {
		Homework5 obj = new Homework5();
		obj.isPrime(3);
		obj.isPrime(17);
		obj.isPrime(24);
		System.out.println(	obj.isPrime(3));
		System.out.println(obj.isPrime(17));
		System.out.println(obj.isPrime(24));
	}
}
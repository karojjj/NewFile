package com.syntax.class03;
public class PrimitiveCasting {

	// if we forget to main method(public class) short way is type "main" then ctrl+space (autocomplete)

	public static void main(String[] args) {
		//int num=10.0; error; because it can not convert from double to int
				//casting is a process of converting the value from one type to another way==>understand what and why
				//there are two types of casting; automatic/widening/implicit casting and manual casting/narrowing/explicit
				//widening is starting from smallest to converting to biggest . For instance;byte=> short=>int=>long=>float=>double..
				//narrowing/expilicit is starting from biggest to converting smallest like double=>float=>long=>int=>short=>byte
				//we can cast primitive and non primitive data types
				
		
		int i=10;
		//widening or implicit
		//we store int value 10 inside double variable
		double d=10; //widening or implicit. we store int value 10 inside double variable
		System.out.println(i); //10
		System.out.println(d);//10.0 it is decimal number
		
		//int num=10.0;//type mismatch:can not convert from double to int
		int num=(int)10.99;// narrowing or explicit casting.we store double value 10.99 into int variable
		System.out.println(num);
		
		
		//	byte b=128; // can not convert from int to byte
		byte b=(byte)1000;
		System.out.println(b); //-24?
		
		long number=11568768768l;
		System.out.println(number);
		int numb=(int)11568768768l;//narrowing
		System.out.println(numb);
		// operators 1. assignment (=) 2. arithmetical=,-,+,*,/,%
		
	}
}

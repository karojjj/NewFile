package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// creating an array that holds 4 elements
		int[] numbers = new int[4];
		// storing values/element inside an arrar
		numbers[0] = 90;
		numbers[1] = 87;
		numbers[2] = 89;
		numbers[3] = 99;
		// print 99
		System.out.println(numbers[3]); // 99
		System.out.println(numbers[3] + numbers[0]); // 99+90=189

		// i want to create an array of countries
		String[] countries = new String[5];

		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "Afghanistan";
		countries[3] = "Moldova";
		countries[4] = "Morocco";
		// countries[5]="Turkey";
		// System.out.println(countries[5]);// Index 5 out of bounds for length 5
		System.out.println(countries[3] + countries[4]);// it does concenation

		String[] names = new String[5];
		
		names[1] = "Orsan";
		names[2] = "Gulnar";
		names[3] = "Mahmut";
		names[4] = "Lidia";

		System.out.println(names[3]);

		System.out.println("Value in index 0 is= " + names[0]); //if we do not add index [0] or names[0] , it will give null value
		
		names[1]="Hakan"; // we did resassign
		System.out.println(names[1]);
		
		//create an array to store 4 different prices
		 
		double[] prices=new double [4];
		prices[0]=1.99;
		prices[1]=3.78;
		prices[2]=9.99;
		prices[3]=7;
		
		double avg=( prices[0]+prices[1]+prices[2]+prices[3]/4);
		System.out.println( avg);
		
	}

}

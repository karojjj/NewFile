package com.syntax.class04;

public class DonorTaskHW {

	public static void main(String[] args) {
		/*
		 * 
		 * Create a Java program and call it a Donor. In order to be eligible to donate
		 * your blood you have to be 18 years old or older. Also once you identify age
		 * eligibility then we have to see if person matches weight requirements. If
		 * person weight it more than 110 lbs → then he/she is eligible, otherwise we
		 * cannot accept such a patient.
		 */

		int age = 29;
		int weight = 100;
		if (age >= 18) {
			System.out.println("You meet age requirements ");
			if (weight >= 110) {
				System.out.println("you are eligible donate your bload");
			} else {
				System.out.println("you are not eligible for blood donation");
			}

		}else {
			System.out.println("we can not accept you as a patient sorry canim");
		}
	}
}

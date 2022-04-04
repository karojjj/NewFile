package com.syntax.class04;

public class NestedIfAllergyHW {

	public static void main(String[] args) {

		// declare a varible for allergy
		// if you have allergy( if you have pollen, peanut, wheat)
		// if no allergy ==>you are lucky
//nested if ==>always has a dependency on outer if
		// outer if Must be true in order for nested if to be check
		boolean allergy = true;
		if (allergy) {
			System.out.println("Lets check which allergy type you have ");
			String allergyType = "Peanut";
			if (allergyType.equals("Pollen")) {
				System.out.println("Play stay at home when trees are blooming.Take medicine A ");
			} else if (allergyType.equals("Peanut")) {
				System.out.println("pls do not eat food contains nuts take medicine B");
			} else if (allergyType.equals("gluten")) {
				System.out.println("follow gluten free diet take medicine c");
			}

		} else {
			System.out.println("You are lucky");
		}

	}

}

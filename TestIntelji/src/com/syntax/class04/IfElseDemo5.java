package com.syntax.class04;

public class IfElseDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 10;
		boolean sale = true;
		char gender = 'F';
		double dicount = 0.15;
		double finalPrice = 0;

		if (sale) {
			if (gender == 'F') {
				if (price > 5) {
					int discount = 0;
					finalPrice = price - price * discount;
				}
			}

		} else {
			finalPrice = price;
		}
		if (sale && gender == 'F' && price > 5) {
			int discount = 0;
			finalPrice = price - price * discount;
			System.out.println("line 1");
		} else {
			finalPrice = price;
			System.out.println("line 2");
		}
	}

}

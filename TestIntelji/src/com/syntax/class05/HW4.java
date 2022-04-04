package com.syntax.class05;
import java.util.Scanner;
public class HW4 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Is there a sale yes or no?");
		String answer=input.next();
		switch (answer) {
		case "no":
			System.out.println("You are not going shoppng");
			break;
		case "yes":
			System.out.println("Please enter price");
			double price=input.nextDouble();
			double percent=0;
			if (price<20) {
				percent=.10;
			}else if (price>=20 && price<100) {
				percent=.20;
			}else if (price>=100 && price<500) {
				percent=.30;
			}else if (price>=500) {
				percent=.50;
			}
			
			double discount=price*percent;
			double finalPrice=price-discount;
			System.out.println("After discount "+discount+"the price of the item reduce from "+price+" to "+ finalPrice);
			break;
		default:
			System.out.println("Please enter a valid answer!");
			break;
		}
		}
	// TODO Auto-generated method stub
}
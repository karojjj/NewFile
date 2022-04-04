package com.reviewclass.exercises;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month="Jan";
		int day=2;
		
		if("Jan".equals(month)&&day==1) {
			System.out.println("1st of Jan");
			
		}else if("Jan".equals(month)&&day!=1) {
			System.out.println("Any of Jan");
		}else {
			System.out.println("not Jan");
		}
	}

}

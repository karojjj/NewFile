 package com.syntax.class06;

public class SwitchCase {

	public static void main(String[] args) {
		// switch case is another conditional statement
		//switch(variable){
		//default value of all non primitive types is ==>null
		int day = 5;
		String dayName=null;
		if (day == 1) {
			dayName = "Monday";
		} else if (day == 2) {
			dayName = "Tuesday";

		} else if (day == 3) {
			dayName = "Wednesday";
		} else if (day == 4) {
			dayName = "Thursday";
		} else if (day == 5) {
			dayName = "Friday";

		} else if (day == 6) {
			dayName = "Saturday";
		} else if (day == 7) {
			dayName = "Sunday";
		}
		System.out.println(dayName);
		System.out.println("--------------");
		
		// alternative way to do it with switch statement
		//if we do not add "break;" java will not stop it will execute the next codes automatically
		switch(day) {
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thusday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		default:
				dayName="Invalid";
				break;
			
		}
		System.out.println(dayName);
	}

}
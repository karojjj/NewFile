package com.syntax.class09;

public class Exercise2 {

	public static void main(String[] args) {
		// create an array of countries.While retrieving all values from array print
		// capital for each country
		String[] countries = { "Poland", "Germany", "Ukraine", "Russia", "UK", "Turkey" };
		String capital = null;
		for (int i = 0; i < countries.length; i++) {
			switch (countries[i]) {
			case "Poland":
				capital = "Warsaw";
				break;
			case "Germany":
				capital = "Berlin";
				break;

			case "Ukraine":
				capital = "Kiev";
				break;

			case "Russia":
				capital = "Moscow";
				break;

			case "UK":
				capital = "London";
				break;
			case "Turkey":
				capital = "Ankara";
				break;
			}
			System.out.println("The capital of the country " + countries[i] + " is " + capital);
		}
	


			System.out.println("Another way");
			for (String country : countries) {
				if (country.equals("Poland")) {
					capital = "Warsay";

				} else if (country.equals("Germany")) {
					capital = "Berlin";
				} else if (country.equals("Ukraine")) {
					capital = "Kiev";
				} else if (country.equals("Russia")) {
					capital = "Moscow";

				} else if (country.equals("UK")) {
					capital = "London";

				} else if (country.equals("Turkey")) {
					capital = "Ankara";

				}
			}
		}
	}


package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
	
		Phone pixel = new Phone();
		pixel.make = "Pixel";
		pixel.model = "pixel 6";
		pixel.noOfCams = 2;
		pixel.color = "Blue";
		pixel.os = "Android 12";
		pixel.ScreenSize = 6.8;
		pixel.makeCall();
		pixel.takePictures();
		pixel.printCompleteInfo();
		System.out.println("===================================");
	}

}

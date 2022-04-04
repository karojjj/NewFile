package com.syntax.class12;

public class Phone {
	// attributes
	String make;
	String model;
	int noOfCams;
	String color;
	double ScreenSize;
	String os;

	// behaviours/methods
	void makeCall() {
		System.out.println("Making a call");
	}

	void takePictures() {
		System.out.println("Taking pictures");
	}

	void recordvideo() {
		System.out.println("Recording video");

	}

	void playingmusic() {
		System.out.println("Playing music");
	}

	void printCompleteInfo() {
		System.out.println("make = " + make);
		System.out.println("model = " + model);
		System.out.println("noOfCams = " + noOfCams);
		System.out.println("color = " + color);
		System.out.println("screenSize = " + ScreenSize);
		System.out.println("os = " + os);
	}

	public static void main(String[] args) {

		Phone iphone = new Phone();
		iphone.make = "Apple";
		iphone.model = "Iphone 13";
		iphone.noOfCams = 3;
		iphone.color = "Blue";
		iphone.os = "IOS";
		iphone.ScreenSize = 6.8;
		iphone.makeCall();  //to call methods or behaviours
		iphone.takePictures(); //to call methods or behaviours
		iphone.playingmusic();  //to call methods or behaviours
		iphone.recordvideo();      //to call methods or behaviours
		iphone.printCompleteInfo();
		System.out.println("===================================");
		Phone samsung = new Phone();
		samsung.make = "Samsung";
		samsung.model = "S22 Ultra";
		samsung.noOfCams = 4;
		samsung.os = "IOS";
		samsung.color = "Pink";
		samsung.ScreenSize = 6.5;
		samsung.makeCall();
		samsung.takePictures();
		samsung.playingmusic();
		samsung.recordvideo();
		samsung.printCompleteInfo();
		System.out.println("===================================");
		Phone pixel = new Phone();
		pixel.make = "Pixel";
		pixel.model = "pixel 6";
		pixel.noOfCams = 2;
		pixel.color = "Blue";
		pixel.os = "Android 12";
		pixel.ScreenSize = 6.8;
		pixel.makeCall();
		pixel.takePictures();
		pixel.recordvideo();
		pixel.playingmusic();
		pixel.printCompleteInfo();

	}

}

package com.syntax.class22;

public class HW1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
    Rectangle, Square,Box
     */
    double length,height, width;
    static void callArea(double width){
        System.out.println("square of area is "+Math.pow(width, 2));
    }
    static void callArea(double width, double length){
        System.out.println("rectangle of area is "+width*length);
    }
    static void callArea(double width, double length, double height){
        System.out.println("box of the area is "+ width*length*height);
    }


    public static void main(String[] args) {
        callArea(4);
        callArea(4, 6);
        callArea(2, 4, 7);
    }
    }

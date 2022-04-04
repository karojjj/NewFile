package com.syntax.class21;

public class MethodOverLoadDemo {  //we can have the same method name and variables now  but the data types must be
    // different parameters
   static void add(int num1, int num2){ // we can access the fields without creating class
       System.out.println("m1");
        System.out.println(num1+num2); //if we call int number it will print this and m1
    }
    static void add(double num1, double num2){
        System.out.println("m2");
        System.out.println(num1+num2); //if we call double

    }
    static void add(String num1, String num2){
        System.out.println("m3");
        System.out.println(num1+num2); //if we call double

    }

    public static void main(String[] args) {
       add(10, 10); //just calling method without creating object of class because in the method we used static keyword
       add(10.0, 10.);// calling the double method
        add("hi", "hi");// calling string method

    }
}

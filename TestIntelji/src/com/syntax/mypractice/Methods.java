package com.syntax.mypractice;

public class Methods {
    public static void welcome(String name){ //creating a method to return string
        System.out.println(name+ " welcome to our calculator!");
    }
    public static void multiply(int a, int b){ //creating a method to return int
        System.out.println("multiplication "+a*b);
    }
    public static void sum(int a, int b) { //method
        System.out.println("sum of " + a + b);
    }
    public static void divide (int a, int b){ //method
            System.out.println("division of  "+a/b);
    }
    public static void main(String[] args) {
        Methods object=new Methods(); //creating of object of class
        object.welcome("medine");//calling string method
        object.multiply(12, 6); //calling int type of method
        object.sum(12, 7);
        object.divide(21, 7);
    }
}
package com.syntax.class21;

public class MethodOverloadingDemo2 {
    //We can have the same method, variable name, data types but we have to change the place of parameters
    void printInfo(String name, int age, double weight){
        System.out.println("M1");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo( int age,String name, double weight){
        System.out.println("M2");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo(String name,  double weight, int age){
        System.out.println("M3");
        System.out.println(name+" "+age+" "+weight);
    }
    void printInfo( double weight, int age, String name){
        System.out.println("M4");
        System.out.println(name+" "+age+" "+weight);
    }

    public static void main(String[] args) {

    }
}

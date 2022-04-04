package com.syntax.mypractice;

public class Ex2 {
    //// Create a method that will say Hello in different language
    // based on the country that will passed when method is executed.
    String hello(String country) {
        switch (country) {
            case"turkey":
                return "merhaba";
            case "azeri" :
                return "salam";
            case"usa":
                return"hi";
            default:
                return"unknown";
        }
    }

    public static void main(String[] args) {
        Ex2 obj=new Ex2();
        System.out.println(obj.hello("turkey"));
    }}

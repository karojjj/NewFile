package com.myinternet.study;

public class OverloadEx2 {
    public static void main(String[] args) {
        System.out.println(Med.add(5, 7));
        System.out.println(Med.add(23.99, 45.9));
    }
}
class Med{
    static int add(int a, int b){
        return a+b;
    }
    static double add(double a, double b){
        return a+b;
    }
}

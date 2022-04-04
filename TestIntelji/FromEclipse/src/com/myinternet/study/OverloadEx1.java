package com.myinternet.study;
//Method overloading increases the readability of the program.
public class OverloadEx1 {
    public static void main(String[] args) {
        //method is static and overload so we do not need to create object of class
        System.out.println(Adder.add(2, 4));
        System.out.println(Adder.add(4, 7, 9));
    }

}
class Adder{
    static int add(int a, int b){
        return a+b;
    }
    static int add (int a, int b, int c){
        return a+b+c;
    }
}

package com.syntax.mypractice;

public class Ex1 {
    void numbers(int num){ //creating a method which has int parameters
        if(num%2==0){ //checking if num is even or odd
            System.out.println(num+" is even");
        }else{
            System.out.println(num+" is odd");
        }

    }
    public static void main(String[] args) {
//// Create a method that will take a number and prints whether the number is even or odd
        Ex1 obj=new Ex1();//creating an object of class
        obj.numbers(2);//calling method
        obj.numbers(5);

    }
}

package com.syntax.mypractice;

public class Ex4 {
    ////Create a method that will take 2 parameters as a numbers and prints which number is larger
    void printLarger(int num1, int num2) {  //Create a method that will take 2 parameters as a numbers
        if(num1>num2) {
            System.out.println("Number 1 is  greater");
        }else if(num2>num1) {
            System.out.println("Number 2 is greater");
        }else {
            System.out.println("numbers are equal");
        }
    }
    public static void main(String[]args) {
        Ex4 obj=new Ex4();
        obj.printLarger(10,10);
        obj.printLarger(3, 7);
        obj.printLarger(1, 9);


    }
}

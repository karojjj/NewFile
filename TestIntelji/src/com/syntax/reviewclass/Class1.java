package com.syntax.reviewclass;

public class Class1 {
    public void printSmallerDigit(int x, int y){ //method and two parameters
        if (x<y){
            System.out.println(x+"  is smaller one");
        } else if(y<x){
            System.out.println(y+" is smaller one");
        } else{
            System.out.println(x+" and  "+y+" both the values are same");
        }
    }

    public static void main(String[] args) {
        Class1 obj=new Class1(); //creating the object of Class1
        obj.printSmallerDigit(1, 5);//calling method
        obj.printSmallerDigit(5, 5);

    }
}

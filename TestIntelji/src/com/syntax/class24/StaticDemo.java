package com.syntax.class24;

public class StaticDemo {
}
class Cat{
    Cat(String name){
        this.name=name;
    }
    static int noOfLegs=4;
    String name;
    public void printInfo(){
        System.out.println(name+noOfLegs);
    }
    public static void Print(){

        // we can not access the instance fields directly inside static methods
//  System.out.println(name+noOfLegs);
        //we cannot use instance fields
        System.out.println(noOfLegs);
    }

    public static void main(String[] args) {
        Cat cat=new Cat("stella");
        Cat.Print();
        Cat cat2=new Cat("nutella");
        Cat.Print();
    }
}
package com.myinternet.study;
//An abstract class can have a data member, abstract method,
// method body (non-abstract method), constructor, and even main() method.
public class AbstractionExample4 { ////Creating a  class which calls abstract and non-abstract methods
    public static void main(String[] args) {
        Bike bike=new Honda();
        bike.run();
        bike.changeGear();

    }
}
//Example of an abstract class that has abstract and non-abstract methods
//Rule: If there is an abstract method in a class, that class must be abstract.
abstract class Bike{
    Bike(){
        System.out.println("bike is created!");
    }
    abstract void run();
    void changeGear(){
        System.out.println("gear changed");
    }
}
class Honda extends Bike{
    @Override
    void run() {
        System.out.println("running safely");
    }
}
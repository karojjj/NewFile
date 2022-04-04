package com.syntax.class24;

public class DogTester {
    public static void main(String[] args) {
        Dog object=new Dog();
        System.out.println(object);
        Dog object1=new Dog("tommy", "green","redbull",12, 25.6);
        System.out.println(object1);
        object1.changeInfo("rocky");
        System.out.println(object1);
    }
}

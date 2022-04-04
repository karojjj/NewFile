package com.syntax.class23;

public class DogTester {
    public static void main(String[] args) {
        Dog dog=new Dog(); //
        System.out.println(dog);
        Dog dog2=new Dog("Tommy", "red","redbull", 12, 34.0);
        dog2.changeInfo("rocky", "black", "huksy");
        System.out.println(dog2);
    }
}

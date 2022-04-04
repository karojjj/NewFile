package com.syntax.mypractice;

public class Main {
    public static void main(String[] args) {
        Car car=new Car("toyota","Rav4",2017);

        car.setMake("bmw");
        car.setModel("something");
        car.setYear(2022);
        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}

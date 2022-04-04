package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<Double> numbers=new ArrayList<>();
        numbers.add(10.5);
        numbers.add(100.5);
        numbers.add(12.9);
        numbers.add(1.5);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.get(2)); //12.9
        numbers.remove(2);
        System.out.println(numbers);  //[10.5, 100.5, 1.5]
        System.out.println(numbers.size());//3
        System.out.println(numbers.contains(10.5)); //true
        System.out.println("---------------------");
        for(Double num:numbers){
            System.out.println(num);

        }
    }
}

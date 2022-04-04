package com.syntax.class28;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        //create a new ArrayList
        ArrayList<Integer> elements=new ArrayList<Integer>();
        //add three elements
        elements.add(10);
        elements.add(20);
        elements.add(30);
        System.out.println("elements of the array list are : "+ elements);
        int count= elements.size();
        System.out.println("Size of ArrayList after element addition : "+count);
        elements.remove(2); //it removes element index of 2
        System.out.println(elements.remove(1));
    }
}

package com.syntax.class27;

import java.util.ArrayList;

public class arrayListDemoo4 {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList<>();
       fruits.add("apple");
       fruits.add("orange");
       fruits.add("banana");

        ArrayList<String> vegetables=new ArrayList<>();
        vegetables.add("potato");
        vegetables.add("tomato");
        vegetables.add("carrot");

        ArrayList<String> groceries=new ArrayList<>();
        groceries.addAll(fruits);
        groceries.addAll(vegetables);
        System.out.println(groceries);


    }
}

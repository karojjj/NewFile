package com.syntax.class28;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetDemo2 {
    public static void main(String[] args) {
        LinkedHashSet<String> fruit=new LinkedHashSet<>();
        //does not allow duplication and maintain insertion order

        fruit.add("apple");
        fruit.add("mango");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("apple");
        System.out.println(fruit);

    }
}

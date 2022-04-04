package com.syntax.class28;

import java.util.HashSet;

public class SetDemo1 {
    public static void main(String[] args) {
        HashSet<String> fruit=new HashSet<>();
        //set does not allow duplicate value and no insertion order
        fruit.add("apple");
        fruit.add("mango");
        fruit.add("orange");
        fruit.add("banana");
        fruit.add("apple");
        System.out.println(fruit);
        // Sets will be used only when you need to remove duplicates
    }
}

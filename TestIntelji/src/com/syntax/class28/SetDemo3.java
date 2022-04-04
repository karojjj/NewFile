package com.syntax.class28;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo3 {
    public static void main(String[] args) {
    TreeSet<String> fruit=new TreeSet<>();
        //it sorts elements and remove duplicate

        fruit.add("a");
        fruit.add("b");
        fruit.add("c");
        fruit.add("d");
        fruit.add("d");
        System.out.println(fruit);
    }
}

package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListtDemo7 {
    public static void main(String[] args) {
        ArrayList<String> fruitlist=new ArrayList<String>();
        fruitlist.add("mango");
        fruitlist.add("apple");
        fruitlist.add("strawberry");
        fruitlist.add("watermelon");
        fruitlist.remove("strawberry");
        //fruitlist.clear();
        fruitlist.contains("rasperry");
        System.out.println(fruitlist);
    }
}

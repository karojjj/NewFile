package com.syntax.class28;

import java.util.ArrayList;

public class Task6 {
    public static void main(String[] args) {
        //create an arrayList that will store 5 names into it
        //find out whether the given arraylis is empty or not
        //check whether the specific name is present in arraylist or not
        //find the size of your arraylist and print all values from that

        ArrayList<String> names=new ArrayList<>();
        names.add("med");
        names.add("berf");
        names.add("arin");
        names.add("roni");
        names.add("bahoz");
        names.isEmpty();
        System.out.println(names.isEmpty());
        names.contains("arin");
        System.out.println(names.contains("arin"));
        names.size();
        System.out.println(names.size());
        System.out.println(names);

    }
}

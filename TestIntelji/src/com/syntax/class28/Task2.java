package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    public static void main(String[] args) {
        //Create an arrayList of words. Remove every word that ends with “e”.
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("java");
        arrayList.add("love");
        arrayList.add("lahore");
        arrayList.add("cake");
        System.out.println(arrayList);
        Iterator<String> iterator=arrayList.iterator();
        while(iterator.hasNext()){
            if(iterator.next().endsWith("e")){
               iterator.remove();
            }
            System.out.println(arrayList);
        }
        //LAMBDA EXPRESION
        /*
        arrayList.removeIf(s-> s.toLowerCase().endsWith("e");
        */


    }
}

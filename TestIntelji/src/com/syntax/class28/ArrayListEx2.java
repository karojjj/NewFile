package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2 {
    public static void main(String[] args) {
        //how to loop ArrayList in Java?
        ArrayList<Integer> arrayList=new ArrayList<>();
        //add 5 elements
        arrayList.add(12);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(42);
        arrayList.add(17);
        //for loop for iterating ArrayList
        System.out.println("for loop for iterating ArrayList");
        for(int i=0; i< arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
        System.out.println("Advanced for loop");
        for(Integer list:arrayList){
            System.out.println(list);
        }
        System.out.println("looping ArrayList using iterator");
        Iterator iterator=arrayList.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

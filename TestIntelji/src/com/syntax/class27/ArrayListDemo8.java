package com.syntax.class27;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>(); //can be replaced  randomly
        //arraylist when it comes to accessing data , it is super fast
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(50);
        arrayList.add(60);
        arrayList.add(1, 100); //we changed index1 to 100
        System.out.println(arrayList);

        LinkedList<Integer> numbers=new LinkedList<>();
        //linked list is slow when it comes to iterative data
       numbers.add(10);
       numbers.add(20);
       numbers.add(30);
       numbers.add(50);
       numbers.add(60);
       numbers.add(1, 100);
        System.out.println(numbers);


    }
}

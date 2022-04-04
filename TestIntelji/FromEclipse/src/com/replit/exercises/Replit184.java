package com.replit.exercises;

import java.util.ArrayList;

public class Replit184 {
    public static void main(String[] args) {
        /* Create a array list that will hold Integer Objects:  Add below elements to it.
111
222
333
444
555
666
Print first, third and fifth element from your array
         */

        ArrayList<Integer> arraylist=new ArrayList<>();
        arraylist.add(111);
        arraylist.add(222);
        arraylist.add(333);
        arraylist.add(444);
        arraylist.add(555);
        arraylist.add(666);
        //in order to get index number from arraylist we have to use get(); method
        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.get(4));
    }
}

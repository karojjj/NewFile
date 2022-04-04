package com.replit.exercises;

import java.util.ArrayList;

public class Replit185 {
    public static void main(String[] args) {
        /*
        Create an arrayList of type Integer.add below values.
111
111
111
999
999
999
Print all the values of List 1 by 1:
         */
        ArrayList<Integer> arraylist=new ArrayList<>();
        arraylist.add(111);
        arraylist.add(111);
        arraylist.add(111);
        arraylist.add(999);
        arraylist.add(999);
        arraylist.add(999);
       for(Integer arr:arraylist){
           System.out.println(arr);
       }

    }
}

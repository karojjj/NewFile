package com.replit.exercises;

import java.util.ArrayList;

public class Replit183 {
    public static void main(String[] args) {
        /*
      Create an array list that will hold String Objects
Find out wether array list is empty or not.
Add String value "Syntax" to it
Find out wether array list is empty or not.
         */
        ArrayList<String> a=new ArrayList<>(); //Create an array list that will hold String Objects

        System.out.println(a.isEmpty()); //Find out wether array list is empty or not.
        a.add("String"); //Add String value "Syntax" to it
        System.out.println(a.isEmpty());//Find out wether array list is empty or not.
    }
}
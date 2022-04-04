package com.syntax.class26;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
   //   String [] strArray={"India", "USA","Turkey" , "North Korea"};
       // strArray[1]="North Korea";
     //  for(String s: strArray){
        //   System.out.println(s);
             //arraylist

           System.out.println("-----------------------------");
            ArrayList<String> list=new ArrayList<>();
            list.add("India");
            list.add("USA");
            list.add("Turkey");
            list.add(0, "North Korea"); // changing index place for north korea
        list.contains("USA");
        System.out.println(list.contains("USA")); //TRUE
       // list.clear(); // it will clear all elements

             System.out.println( list.get(1));
            //we can add many countries as we wish
            //to print all elements we can use enhance loop
            for(String s1: list){
                System.out.println(s1);
            }
        }
    }


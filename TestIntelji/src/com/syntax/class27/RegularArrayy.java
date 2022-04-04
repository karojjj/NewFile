package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;

public class RegularArrayy {
    public static void main(String[] args) {
       // String[] friendsArray=new String[4];
        //to do ArrayList
      //  ArrayList<String> friendsArrayList=new ArrayList<>();
        //array list do not have a fix size this is one of the biggest benefit of ArrayList.
        // it can grows and shrinks automatically
        //it make programming a lot easier

        String[] friendsArray={"John", "Chris", "Eric", "Luke"};

        System.out.println(friendsArray[0]);
        System.out.println(friendsArray[1]);
        System.out.println(friendsArray[2]);
        System.out.println(friendsArray[3]);
        System.out.println(friendsArray.length);
        System.out.println("------------------------");

         ArrayList<String> friendsArrayList=new ArrayList<>(Arrays.asList("medine", "arin","eric", "luke"));

        System.out.println(friendsArrayList.get(0));
        System.out.println(friendsArrayList.get(1));
        System.out.println(friendsArrayList.get(2));
        System.out.println(friendsArrayList.get(3));
        System.out.println(friendsArrayList.size());
        System.out.println(friendsArrayList);
        //Not: arrays can not add an element to the end of the array due to it having a fixed size
        friendsArrayList.add("suphi");
        System.out.println(  friendsArrayList.add("suphi"));

    }
}

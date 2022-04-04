package com.syntax.class26;

import java.util.ArrayList;

public class CollectionDemo2 {
    public static void main(String[] args) {
        ArrayList<String> countries =new ArrayList<>();
        countries.add("turkey");
        countries.add("irak");
        countries.add("greek");
        countries.add("pakistan");
        countries.add("afganistan");
        countries.add("turkmenistan");
        System.out.println(countries.get(3));//pakistan
        System.out.println(countries.get(0)); //turkey
       // System.out.println(countries.get(-1)); INDEX START WITH ZERO SO IT WILL GIVE ERROR:ARRAYINDEXOUTOFBOUNDSEXCEPTION
       // System.out.println(countries.get(7)); //IndexOutOfBoundsException we have 5 index
        System.out.println(countries);
        countries.add(3, "pakistan");//inserts the elements at this specified indexs
        System.out.println(countries);
        //how to get size of array?
        System.out.println(countries.size());//7
        //how to remove the element
        countries.remove("pakistan");
        System.out.println(countries);
        //how to clear everything?
        countries.clear();
        System.out.println(countries);
        System.out.println(countries.size()); //0
    }

}

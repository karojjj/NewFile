package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("JAVA");
        courses.add("JAVA");
        courses.add("Selenium");

        Iterator<String> iterator = courses.iterator(); //iterator is a interface,
        iterator.hasNext(); //it returns true if there is element inside
//hasNext(); method check if there is a next element if there is next element so it will orint true otherwise false
        //next(); method give the next element
        System.out.println( iterator.hasNext());
        System.out.println(iterator.next()); //it gives actual element

        System.out.println( iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println( iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println( iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println( iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println( iterator.hasNext());
        //System.out.println(iterator.next()); //false because there is no next element size is 4 when we print 5 nextimes no next element left

    }
}

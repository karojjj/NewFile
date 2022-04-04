package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo4 {

    //iterator is a interface which has three methods, hasNext(); next(); and remove();
    public static void main(String[] args) {
        List<String> courses = new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("JAVA");
        courses.add("JAVA");
        courses.add("Selenium");
        Iterator<String> iterator = courses.iterator(); //iterator is a interface,
        System.out.println(courses);
        while (iterator.hasNext()) {
            if (iterator.next().equals("JAVA")){
                iterator.remove(); // remove(); will remove only one item
        }
    }
    System.out.println(courses);
        //when you doing any operations on Lists that can change its size use Iterator otherwise you can use loops
}}


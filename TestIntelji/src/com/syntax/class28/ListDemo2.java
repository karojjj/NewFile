package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class ListDemo2 {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("JAVA");
        courses.add("GIT");
        courses.add("Selenium");
        courses.add("TestNg");
        courses.add("Cucumber");
        courses.add("SQL");
        courses.add("API");
        courses.add("Jenkins");
        courses.add("Interview");
        courses.add("Resume");
        courses.add("AWS");
        courses.add("APML");
        courses.add("Docker");
        courses.add("Dead");

        System.out.println(courses); //listing courses
        System.out.println(courses.size()-1); //it gives last index

        courses.set(courses.size()-1, "Happy"); //replace

        System.out.println(courses);


    }
}

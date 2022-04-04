package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("JAVA");
        courses.add("GIT");
        courses.add("Selenium");
        System.out.println(courses);
        //lambda expression in the List framework
        courses.replaceAll(s -> {
            if (s.equals("JAVA")){
                return "happy";
            }else{
                return s;
            }
        });
    }
}

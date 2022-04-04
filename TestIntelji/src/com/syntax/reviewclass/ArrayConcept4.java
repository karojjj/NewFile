package com.syntax.reviewclass;

public class ArrayConcept4 {
    public static void main(String[] args) {
        //How many times will the following code print "Welcome to Java"?
        int count = 0;
        while (count++ < 10) {
            System.out.println("Welcome to Java "+ count);
        }
        System.out.println("----------------");

        int y = 0;
        for (int i = 0; i < 10; ++i) {
            y += 1;
        }
    }
}

package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemoo3 {
    public static void main(String[] args) {
        ArrayList<Boolean> flags=new ArrayList<>(); //flags contains true or false thats we use flag as a variable
        flags.add(true);
        flags.add(true);
        flags.add(false);
        flags.add(true);
        System.out.println(flags.contains(false));//add
        System.out.println(flags.isEmpty()); //false

    }
}

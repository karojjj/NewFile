package com.syntax.class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDemo1 {
    public static void main(String[] args) {
        String name="Yazgul";
        String name2="farah";
        //Not scalable if we have to store large amount of data
        //arrays can be good option to tackle this problem
        String [] names={"Yazgul", "andrew"};
        //names[2]="Teyfur";
        String [] names2=new String[1000];
        names2[0]="Elena";
        names2[2]="andrew";
        System.out.println(Arrays.toString(names2));
        ArrayList<String> syntaxStudents=new ArrayList<>();
        //ArrayList=> name of the class
        // <> diamond operator
        //String datatype
        syntaxStudents.add("dimo");
        syntaxStudents.add("mike"); //we can add as many as value we want
        System.out.println(syntaxStudents);

    }
}

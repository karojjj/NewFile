package com.syntax.class27;

import java.util.ArrayList;

public class WrapperClasses {
    //wrapper class: provides a way to use primitive data types as reference data types
    //reference data types contain useful methods
    //can be used with collections(ex.ArrayList)
    public static void main(String[] args) {
        int i=5;

        Integer ii=new Integer(i); //passing primitive value inside the object calling is Boxing

        Integer jj=i; //autoboxing //assigning primitive value to the integer object

        int  j=jj.intValue(); //unboxing

        int k=jj; //autoboxing

        ArrayList<Integer> values=new ArrayList<Integer>();
        values.add(5);
        values.add(7);

    }
}

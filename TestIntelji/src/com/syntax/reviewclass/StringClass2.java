package com.syntax.reviewclass;

public class StringClass2 {
    public static void main(String[] args) {
        String student = "Teyfur";
    //startsWith(); boolean data type( output true or false)
        System.out.println(student.startsWith("T"));//true
        System.out.println(student.toLowerCase().startsWith("T"));//false
        //method chaining (calling multiple methods on the same line)
        System.out.println(student.endsWith("r"));
        System.out.println(student.contains("y")); //true
        System.out.println(student.charAt(1));
        String name="habib";
        char output=name.charAt(2);
        System.out.println(output); //
    }
}
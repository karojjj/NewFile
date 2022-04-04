package com.syntax.Class16;

public class StringvsStringBuilder {
    public static void main(String[] args) {
        String s=new String("Ashgar is great"); //creating object of clas //original string
        s.concat("hahhahah");//add new string hhahah to the string
        System.out.println(s); //printing out the originak string
        System.out.println(s.replace(" ", ""));


        System.out.println("_____________________");
        //how to reverse a string? we can use StringBuilder
        StringBuilder stringBuilder=new StringBuilder("Ashgar is great"); //original string
        System.out.println(stringBuilder.reverse()); //add new string hhahah to the string
        System.out.println(stringBuilder);  //printing out the original string
        System.out.println(stringBuilder.append("hahhahah")); //append :combines or concat
        System.out.println(stringBuilder);
    }
}

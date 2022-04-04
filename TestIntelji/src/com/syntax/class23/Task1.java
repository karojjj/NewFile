package com.syntax.class23;

public class Task1 {
    //create a class named "programming"while creating am object of class , if nothing is passed to it, then message
    //"i love programming language" should be printed.if some String is passed to it, then in place of "
    // "programming languages" the value variable should be printed

}
class Programming{
    Programming(){
        System.out.println("I love programming languages");
    }
    Programming(String s){
        System.out.println("i love "+s);
    }


    public static void main(String[] args) {
        Programming program = new Programming();
        new Programming("Java");
    }
    }

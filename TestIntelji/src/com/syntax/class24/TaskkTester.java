package com.syntax.class24;

public class TaskkTester {
    public static void main(String[] args) {
//if a method is not present inside the parent class we can not call that method using polymorphism
        File[] file = {new JavaFile(), new WordFile(), new PDFFile()};
        int i =0;
        while(i < file.length){
            file[i].open();
            file[i].edit();
            file[i].close();
            i++;
        }}
    }


package com.syntax.class19;

public class Practice2 {
    //writing method in the class to return record
    String getRecord(){
        String department="QA";
        String empname="Violet";
        String details="Worker "+empname+" belongs to "+department;
        System.out.println(details);
        return details;

    }

    public static void main(String[] args) {
        Practice2 object=new Practice2(); //creating object of class
        object.getRecord();

    }
}

package com.syntax.class19;

public class Practice5 {

    String weekDay(String day){
        day=day.toLowerCase();
        switch (day){
            case "monday":
                return"this is a lazy day";
            case "tuesday":
                return "it is slow day";
            case "wednesday":
                return "what a boring day";
            case "thursday":
                return" busy day ";
            case "friday" :
                return " half day work :)";
            case "saturday":
                return "java day";
                default:
                    return "invalid";
        }
    }
    public static void main(String[] args) {
        Practice5 obj=new Practice5();
        obj.weekDay("friday");
        System.out.println(obj.weekDay("friday"));
    }
}

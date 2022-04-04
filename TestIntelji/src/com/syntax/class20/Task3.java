package com.syntax.class20;

public class Task3 { //class Name Task3 so our constructor name must be Task3 as well
    /*
    Write a java class that have 4 constructors
    with 4 different access levels of constructors(private,public,default,protected)
     and create 4 objects of this class: 1 - inside same class;
      2 - from outside the class;
      3 - from different class inside different package  and observe result.
     */
    private Task3(int a){  //constructor 1

        System.out.println("private");
    }
    Task3 (double a){ //constructor 2

        System.out.println("default");
    }
    protected Task3(String a){ //constructor 3

        System.out.println("protected");
    }
    public Task3(boolean a){ ////constructor 4

        System.out.println("public");
    }

    public static void main(String[] args) {
        new Task3( 6);
        new Task3("haha");
        new Task3(10.34);
        new Task3(false);

    }
}

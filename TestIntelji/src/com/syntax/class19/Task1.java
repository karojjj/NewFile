package com.syntax.class19;

public class Task1 {
    /*
    Write a java class that will have a constructor:
     one with parameters
      and second without any parameters.
      Create a separate Test class
      where you will execute both of the constructors 1 by 1.
     */

    //class name:Task1 ==>creating a constructor
    Task1 (){  // no arguments or paramaters
        System.out.println("Constructor 1");
    }
    Task1 (String name){ //one argument or paramter
        System.out.println("Constructor 2");

    }
}

package com.syntax.class22;

public class Task1 {
    /*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed.
     If some String is passed to it, then in place of "programming languages" the value variable should be printed.
    Example, if we pass "Java", then "I love Java" should be printed.
     */


    public static void main(String[] args) {

        Task1 programming=new Task1();
        new Programming("Java");
        main("medine"); //calling main method on line 20
    }

//we can also overload the main method/  method has string args
public static void main(String args) {

    Task1 programming=new Task1();
    new Programming("Java");
}
}

class Programming {
    Programming() {

        System.out.println("I love programming languages");
    }

    Programming(String s) {

        System.out.println("I love " + s);
    }

}
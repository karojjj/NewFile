package com.replit.exercises;

public class Replit170 {
    final void display(boolean myboolean){
        System.out.println("Final metho with boolean parameter");
    }
    final void display(String hello){
        System.out.println(hello);
    }
    public static void main(String[] args) {
        //Overload 2 final instance methods:
        //Call them in main method
        //Expected Output:
        //Final method with boolean parameter
        //Final method with String parameter
        Replit170 object=new Replit170();
        object.display("Final method with String parameter");
        object.display(true);
    }
}

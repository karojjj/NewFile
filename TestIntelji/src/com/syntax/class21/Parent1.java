package com.syntax.class21;

public class Parent1 {
    String name="Parent";
    void printName(){
        System.out.println(name);
    }
}
class Child1 extends Parent1{
    String name="Child"; //instance variable
    void printName(){ //method
        String name="teyfur"; //first priority is given to local variables
        System.out.println(name);
       //when we use  the "this " keyword even though we have a local variable java will only bring the values
        // from instance variables
        System.out.println(this.name);// java ignores the local variables it goes to instance variable
        //when we use the "super"keyword even though we have a local variable and instance variable in the same class
        // java will only bring the values from parent
        //class instance variable
        System.out.println(super.name); // parent
    }
}
class Parent1Tester{
    public static void main(String[] args) {  //main method
        Child1 child1=new Child1(); //object creation of class in the main method
        child1.printName(); //calling child1 class to execute the code
    }
}

package com.syntax.Replit;

public class Replit152 {
    public static void main(String[] args) {
   Child child=new Child();
   child.print();
    }

}

class Parent{
    Parent(){}
    void print(){
        System.out.println("This is Parent constructor");
    }
}
class Child extends Parent{
    Child(){
    super();


    }}

package com.syntax.class21;

public class SuperKeyWordDemo{
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
        child.printInfo();
    }
    class GrandParent{
        String color="blue";
        void printInfo(){
            System.out.println("I am grandpa");
        }
    }

        }
class Parent { //master clas

    String color="black";
    void printInfo(){
        System.out.println("I am parent");
    }

}
class Child extends Parent {
    String color="red";
    void printInfo(){
        System.out.println("I am child");
    }
    void print(){
        printInfo(); //calling i am child
        super.printInfo();//calling i am parent
    }
    void printColor(){
        String color="green";
        System.out.println(color);// here it prints "red" //refers to local variable
        System.out.println(this.color);//if we want to print green so we will use "this" keyword //refers to instance variable
        System.out.println(super.color); //super always refers to master class/ in master class we have black print statement
    }

}

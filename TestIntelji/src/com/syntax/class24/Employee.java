package com.syntax.class24;

public   interface Employee {
    public static final int age=10;// by default all the variables in an interface are public static final

    //everything inside interface must be abstract
    //you can put non-abstract methods inside regular abstract class but not interface
    void work() ;
//all the methods inside an interface which don't have body are abstract public
    }
class Tester implements Employee{
    @Override
    public void work(){
        System.out.println("Testing a website");
    }

    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.work();
        System.out.println(Employee.age);

    }
}

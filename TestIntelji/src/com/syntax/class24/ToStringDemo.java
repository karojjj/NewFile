package com.syntax.class24;

public class ToStringDemo {
    String name;
    int age;
    ToStringDemo(String name, int age){
        this.name=name;
        this.age=age;
    }
    //why we need to write overriding  "toString()" method? interview question
    //why we need to write overriding  "boolean" method? interview question
    @Override
    public String toString(){
        return name+" "+age;
    }

    public static void main(String[] args) {
        ToStringDemo toStringDemo=new ToStringDemo("Medine", 12);
        System.out.println(toStringDemo.toString());

    }
}

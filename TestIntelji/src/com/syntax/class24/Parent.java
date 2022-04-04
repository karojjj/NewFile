package com.syntax.class24;

public class Parent {
    final String name="Medine";
    final void method(){
        //name="mahmut"; we can not reassign if the variable is final
        System.out.println("i am a parent of two beautiful cats");
    }
    void method2(){
    }
}
class Child extends Parent{
 //void method(){}
    //can not override because it is final method
    // we can not extend the class if it is final
    //a final keyword in java can be used with a class, with a variable and with a method
    //final is non access modifier

}
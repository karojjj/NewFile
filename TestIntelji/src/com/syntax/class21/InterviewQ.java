package com.syntax.class21;

public class InterviewQ {

class AAA{
    AAA(){

    }
}
class BBB extends AAA{
    String name;
        BBB(){

        }
        BBB(String name){
            super();
           // this(); we can not use this () and super() inside the same constructor
            this.name=name;
        }
}}
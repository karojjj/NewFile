package com.syntax.class24;

public class AliParents {
    String girlName="Salma";
    double money=10000000;
    void marry(){
        System.out.println("Ali you should marry "+girlName);
    }
}
class Ali extends AliParents{

    String girlName="Rihanna";
    void marry(){
        super.marry();
        System.out.println("But Dad i want to marry"+girlName);
    }
}

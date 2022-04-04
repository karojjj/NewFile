package com.syntax.mypractice;

public class Ex5 {
    public static void main(String[] args) {
        Chair chair=new Chair();

    }
}
class Furniture{
    Furniture(){
        System.out.println("furniture class constructor");
    }
}
class Chair extends  Furniture{
   // super(); we can not call the constructor outside of the chair constructor super(); must be in the constructor
    Chair(){
        super();
        System.out.println("chair class constructor");
    }
}
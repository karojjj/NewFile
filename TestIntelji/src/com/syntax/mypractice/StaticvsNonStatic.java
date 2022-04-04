package com.syntax.mypractice;

public class StaticvsNonStatic {
   static void myStaticvoid(){ //static method
       System.out.println("Static method can be called without creating objects");
   }
   public void myPublicVoidMethod(){ //public method
       System.out.println("public method must be called by creating objects");
   }

    public static void main(String[] args) { //main method

        StaticvsNonStatic object=new StaticvsNonStatic();
        object.myPublicVoidMethod(); //calling public method by creating object
        myStaticvoid(); //calling static method directly
        // myPublicMethod(); This would compile an error
    }
}

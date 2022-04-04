package com.syntax.reviewclass;

public class Class2 {
    String generateUser(String firstName, String lastName){//string type method
  return firstName+"123"+lastName+".com";
    }
    public static void  moreedDemand(){ // we can call static method directly with name, no need to create obj
        System.out.println("this is moreed's functions");

    }

    public static void main(String[] args) {
        Class2 obj=new Class2();
        System.out.println(obj.generateUser("medine", "kaya"));
        moreedDemand(); //calling static method
    }
}

package com.syntax.class25;

 class Computer {

    String make;
    Computer(String make) {
        this.make = make;
    }
    void login(){
        System.out.println("use username and password to login");
    }}
class Apple extends Computer{

    Apple(String make) {
        super(make);
    }
    @Override
    void login(){
        System.out.println("use fingerprint to login as well");
    }
}
class Lenova extends Computer{
     Lenova(String make){
         super(make);
     }
     @Override
    void login(){
         System.out.println("use windowd Hello as well to login");
     }
}
class HP extends Computer{
     HP(String make){
         super(make);
     }
}
    /*
    Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
    Define common behavior within and some fields in parent class and override some of them  methods in child classes
    Define some methods specific to child classes
    Create objects of child classes and store them into array. Loop through each object and execute available methods.
     */
public class Task1{
        public static void main(String[] args) {
            Lenova lenova=new Lenova("Lenova");
            lenova.login();
            HP hp=new HP("HP");
            hp.login();
            //polymorphism
            Computer[] computers={new Lenova("lenova"), new HP("HP"), new Apple("Apple")};
            for (Computer c:computers){
                c.login();
            }
        }
}

package com.syntax.class19;

public class Horse {
    //three variables
    private String name;
    private int age;
    private double weight;
    //purpose of constructor is to give initial values to the fields of a class
  Horse(String horseName, int horseAge, double horseWeight){
      name=horseName;
      age=horseAge;
      weight=horseWeight;
  }
  /*
  constructor name and class name must be the same like Horse is contructor name and class name also
  this is a method it is not a constructor anymore.
  Constructors do not have return types like int string not even void
  void Horse(String horseName, int horseAge, double horseWeight){
      name=horseName;
      age=horseAge;
      weight=horseWeight;
   */
    void printhorseName(){

      System.out.println("name "+ name);
    }
    void setName(String horseName){

      name=horseName;
    }

}

package com.syntax.class21;

import static java.lang.Math.pow;

class Shape1{
    double radius;
    Shape1(double radius){
        this.radius=radius;

    }
}
class Circle1 extends Shape1{
    Circle1(double radius){
        super(radius);
    }
    void calculateAreaa() {
        System.out.println(Math.PI * pow(radius, 2));

    }}
         /*
            Write program: Shape class has a constructor
        that takes the radius and has a subclass as
        circle class. In circle class create a method to
        calculate the area of circle. Test your code

            */
         public class Task2 {

             public static void main(String[] args) {
                 Circle1 circle1 = new Circle1(2);
                 circle1.calculateAreaa();
             }
         }

package com.syntax.groupHW2;
//Create an Interface 'Shape' with undefined methods
//as calculateArea and calculatePerimiter (Math.PI+(2*radius)). Create 2
//classes Circle & Square that implements functionality
//defined in the Shape Interface. Test your code.
public class Task1 {
    public static void main(String[] args) {
        Shape shape=new Square();
        shape.calculateArea(10);
       // ()Square).shape).test(); //casting
    }
}
interface Shape{
     void  calculateArea(double input);
     void calculatePerimiter(double input); //Math.PI+(2*radius)

    }
    class Circle implements Shape{

        @Override
        public void calculateArea(double input) {
            double area=Math.PI*Math.pow(input, 2);
            System.out.println(area);
        }

        @Override
        public void calculatePerimiter(double input) {
            System.out.println(2*Math.PI*input);
        }
    }
class Square implements Shape{

    @Override
    public void calculateArea(double input) {
     double area=input*input;
        System.out.println(area);
    }

    @Override
    public void calculatePerimiter(double input) {
     double perimeter=4*input;
        System.out.println(perimeter);
    }
}
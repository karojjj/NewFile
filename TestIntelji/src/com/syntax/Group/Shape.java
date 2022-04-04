package com.syntax.Group;

public interface Shape {
    double radius=4;
    double length = 3;

 public void calulatePerimiter() ;
 public void calculateArea() ;
}
class Circle implements Shape{
    @Override
    public void calulatePerimiter() {
        System.out.println("circle of perimiter is "+2*Math.PI*radius);
    }

    @Override
    public void calculateArea() {
        System.out.println("the circle of area is "+Math.PI*radius*radius);
    }
}
class Square implements Shape{

    @Override
    public void calulatePerimiter() {
        System.out.println("perimiter of square is "+ 4*length);
    }

    @Override
    public void calculateArea() {
        System.out.println("the area of square is "+length*length);
    }

    public static void main(String[] args) {
       Shape [] shapes={new Square(), new Circle()};
           for (Shape x:shapes){
               x.calulatePerimiter();
               x.calculateArea();
           }

        }
    }

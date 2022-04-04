package com.syntax.class21;
//Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
// In circle class create a method to calculate the area of circle. Test your code
 class Shape {
    double radius;
    public Shape(double radius){ //creating class of constructor and initializing the variables
        this.radius=radius;

    }
}
class Circle extends Shape{
    public Circle(double radius){
        super(radius);
    }
    void area(){
        System.out.println(Math.PI*Math.pow(radius, 2));
    }
}
class Testerr{
    public static void main(String[] args) {

        new Circle(2).area();
    }}
package com.syntax.class27;

public class InterfaceShapeTask {
    /*
    Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimiter.
     Create 2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your code.
     */
    public static void main(String[] args) {
        Shapee shape=new Squaree();
        shape.calculatePerimeter(10);
        // ((Square)shape).test();
    }
}

interface Shapee{
    void calculateArea(double input);
    void calculatePerimeter(double input);
}
class Circlee implements Shapee{

    @Override
    public void calculateArea(double input) {
        double area=Math.PI*Math.pow(input,2);
        System.out.println(area);
    }
    @Override
    public void calculatePerimeter(double input) {
        System.out.println(2*Math.PI*input);
    }
}

class Squaree implements Shapee{

    void test(){

    }
    @Override
    public void calculateArea(double input) {
        double area=input*input;
        System.out.println(area);
    }
    @Override
    public void calculatePerimeter(double input) {
        double perimeter=4*input;
        System.out.println(perimeter);
    }
}



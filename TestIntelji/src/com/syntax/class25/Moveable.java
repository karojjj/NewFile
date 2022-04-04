package com.syntax.class25;

public interface Moveable {
    void move();
}
interface DriveAble {
    void drive();
}
interface Car extends DriveAble, Moveable{

}
class BMW implements Car{
// it implements multiple inheretances
    @Override
    public void move() {
        System.out.println("we can move a car");
    }

    @Override
    public void drive() {
        System.out.println("we can drive BMW");
    }

    public static void main(String[] args) {
        //interfaces can have all types of interfaces
        DriveAble driveAble=new BMW();
        driveAble.drive();
         // driveAble.move(); we can not call it because it is inside the interface Moveable { if we want to call both
        // //method we should call Car car=new BMW(); class

    }
}
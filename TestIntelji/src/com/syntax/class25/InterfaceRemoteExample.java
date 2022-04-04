package com.syntax.class25;

public class InterfaceRemoteExample {
    public static void main(String[] args) {
        Remote remote=new Television();
        remote.powerOf();
        remote.powerOn();
        remote.volumeDown();
        remote.volumeUp();
    }
}
//interface is a medium for the objects to interact with the outside the world
//they contain only abstract methods
interface Remote{ // inside the interface class methods must be abstract and public/methods are by default abstract
    //and public.Avoid using variables within interface
    //variables are by default public s, static and fina;
    abstract public void powerOn();
    abstract public void powerOf();
    abstract public void volumeUp();
    abstract public void volumeDown();

}
class Television implements Remote{
    @Override
    public void powerOn() {
        System.out.println("power on");
    }

    @Override
    public void powerOf() {
        System.out.println("power off");
    }

    @Override
    public void volumeUp() {
        System.out.println("volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("volume down");
    } //Class 'Television' must either be declared abstract or implement abstract method 'powerOn()' in 'Remote'

}
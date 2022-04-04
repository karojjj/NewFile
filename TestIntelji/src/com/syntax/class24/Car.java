package com.syntax.class24;

public class Car {

    void start() {System.out.println("Use keys to start me ");}

    void stop() {System.out.println("Use break to stop me");}

    void Park() {System.out.println("Park me manually");}
}
class BMW extends Car{
    void start(){System.out.println("Start me with button");}

    void stop(){System.out.println("Can use breaks or I can autoBreak ");}

  //  void park(){System.out.println("Use parking sensors to park me ");}

}
class Tesla extends Car{
    void start(){System.out.println("Start me with App or Remote");}

    void stop(){System.out.println("Can use breaks or I can autoBreak ");}

   // void park(){System.out.println("Use AutoParking sensors to park me ");}

}

class Suzuki extends Car{
    void start(){System.out.println("Start me with Keys");}

    void stop(){System.out.println("I lost my breaks and tires on the way");}



}

























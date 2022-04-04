package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("use keys to start me");
    }
    void stop(){
        System.out.println("use breaks to stop me");
    }
    void park(){
        System.out.println("park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("start me with button");
    }
    void stop(){
        System.out.println("can use breaks or i can outbreak");

    }
    void park(){
        System.out.println("use parking sensors to park me");
    }
}
class Tesla extends Car{
    void start(){
        System.out.println("start me with app or remote");
    }
    void stop(){
        System.out.println("can use breaks or i can outbreak");

    }
    void park(){
        System.out.println("use parking sensors or I can auto park myself");
    }
}class Toyota extends Car{
    void start(){
        System.out.println("start me with button");
    }
    void stop(){
        System.out.println("can use breaks or i can outbreak");

    }
    void park(){
        System.out.println("use parking sensors to park me");
    }
}class Suziki extends Car{
    @Override
    void start(){
        System.out.println("push me tp start");
    }
    void stop(){
        System.out.println("can use breaks or i can outbreak");

    }
    void park(){
        System.out.println("use parking sensors to park me");
    }
}

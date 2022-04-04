package com.syntax.reviewclass;

public class Bike{
    int maxSpeed=100;
    int engineCC=125;
    void printMax(){
        System.out.println(maxSpeed);
    }
    void printEngineCC(){
        System.out.println(engineCC);
    }
}
class HondaBikes extends Bike {
    int maxSpeed=150;
    void printMaxSpeed(){
        int maxSpeed=200;
        System.out.println(maxSpeed);
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
    }
    void printInfoFromParentAndChild(){
       printEngineCC();
       this.printEngineCC();
        super.printEngineCC();

    }
}
class Tester{
    public static void main(String[] args) {
        HondaBikes honda=new HondaBikes();
       // honda.printMaxSpeed();
        honda.printInfoFromParentAndChild();
    }
}
package com.syntax.class19;

public class Panda {
    String name="Poe";
    String breed="Red Panda";
    String color="Red";
    double height=2.2;
    int age=12;
    double weight=35.0;
    //constructor one argument
    Panda(String pandaName){
        name=pandaName;

    }
    //class name is a constructor
    //constructor two arguments pr paramater
    Panda(String pandaName,String pandaBreed){
        name=pandaName;
        breed=pandaBreed;

    }
    //multiple arguments
    Panda(String pandaName,String pandaBreed,String pandaColor,double pandaHeight
            ,int pandaAge, double pandaWeight){
        name=pandaName;
        breed=pandaBreed;
        color=pandaColor;
        height=pandaHeight;
        age=pandaAge;
        weight=pandaWeight;
    }
    void printInfo(){
        System.out.println(name+" "+breed+ " "+color+" "+height+" "+age+" "+weight);
    }

}
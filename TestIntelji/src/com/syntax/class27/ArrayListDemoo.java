package com.syntax.class27;

import java.util.ArrayList;

public class ArrayListDemoo {
    public static void main(String[] args) {
        //primitive data types do not work collection frameworks like byte, long, int, double
        //it does not support primitive data types

                ArrayList<Double> numberList=new ArrayList<>();
                Double double1=new Double(10.5);
                double number=double1.doubleValue(); //unboxing
                Double number2=new Double(number);  //boxing
                double number3=10.5;
                Double number4=number3; //autoboxing
                number3=number4; //autoUnboxing

                String name=new String("hakan");
                String name3="Hakan";

            }
        }



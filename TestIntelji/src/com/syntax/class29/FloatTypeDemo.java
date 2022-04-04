package com.syntax.class29;

import java.math.BigDecimal;

public class FloatTypeDemo {
    public static void main(String[] args) {
        //do not need to worry about  this example!!!
        float fl = 3.5f;
        if (fl == 3.5) {
            System.out.println("Equal");
        } else {
            System.out.println("not");
        }
        System.out.println(10 / 3);
        BigDecimal bigDecimal = new BigDecimal(1.333333333333);
        float f1=1.333333333333f;
      double f2=1.333333333333;
        System.out.println(f1);
        System.out.println(f2);
    }
}
package com.syntax.class22;

public class HW3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    public static void something1(String name){System.out.println("1");}
    public static void something1(boolean bol){System.out.println("2");}
    public static void something1(int num){
        System.out.println("3");
    }

    public static void main(String[] args) {
        HW3 myobj=new HW3();
        myobj.something1("medine");
        myobj.something1(true);
        myobj.something1(3);
    }
}



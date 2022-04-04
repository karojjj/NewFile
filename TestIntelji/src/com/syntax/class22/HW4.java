package com.syntax.class22;

public class HW4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
     Then call each overloaded method with specific arguments and observe result.
     */
    private void something(){
        System.out.println("no argument and  overload method 0");
    }
    private void something(String s){
        System.out.println("with one argument "+s);
    }
    private void something(String s, String s1){
        System.out.println(s+s1);
    }

    public static void main(String[] args) {
        HW4 myobj=new HW4();
        myobj.something();
        myobj.something("and method 1 overload");
        myobj.something("argument 2", "method overload 2");
    }
    }

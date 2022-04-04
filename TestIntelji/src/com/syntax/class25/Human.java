package com.syntax.class25;

public interface Human {
    //public static final redundant because by default all the variables are public static final
    //we can not make private static final int legs=4; it gives error
    //if we do not specify , java will make public like static final int legs=4;
    //if we remove static and final keywords java will make "public static final"
    //public static final int legs=4;
    int legs=2;
    //public abstract void walk();
    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default  void noNeedToWorry(){
        System.out.println("defaults methods are there to functional programming");
    }
}
interface LivingBeing{
    static void printLegs(){
        System.out.println("not sure");
}
class Maha implements  Human , LivingBeing{ //We can implements more interfacess class
    @Override
    public void walk() {
        System.out.println("i can walk");
    }

    public static void main(String[] args) {
        Maha maha = new Maha();
        maha.walk();
        //maha.printLegs(); we can not call the static method in the interface because
        Human.printLegs();
        LivingBeing.printLegs();
    }

}}

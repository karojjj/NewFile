package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class Task5 {
    /*
    Create  a  class  Insurance  that  will  have  an attribute as insuranceName and unimplemented
behaviour  as  getQuote  and  cancelInsurance.
Create 3 subclasses Car, Pet, Health. Car class has it’s own attribute as carModel and Class Pet has
petType  attribute.
Create  3  objects  of  the  subclasses  and  store  them  in  ArrayList.
Using  for loop/advanced  for  loop/  iterator  access  all methods of the class.
     */
    public static void main(String[] args) {
       Car car=new Car("Geico", "Toyota");
       Pet pet=new Pet("Boston Animal Insurance","Arin cat");
       Health health=new Health("Bluecross");

        ArrayList<Insurance> hii=new ArrayList<Insurance>();
        //adding Insurance class objects
        hii.add(car);
        hii.add(pet);
        hii.add(health);
        //advanced loop
        for(Insurance hello:hii){
            hello.cancelInsurance();
            hello.getQuote();
        }
        Iterator<Insurance> it=hii.iterator();
        while(it.hasNext()){
            it.next().cancelInsurance();
        }
       Iterator<Insurance> it2= hii.iterator();
        it2.next().getQuote();
    }
}
abstract class Insurance{
    String insuranceName;
//unimplemented behaviour  as  getQuote  and  cancelInsurance. use"ABSTRACT METHOD"
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;

    }
    abstract void getQuote() ;
    abstract void cancelInsurance();
}
class Car extends Insurance{
    String carModel;
    Car(String insuranceName, String carModel){
        super(insuranceName);
        this.carModel=carModel;

    }
    @Override
    void getQuote() {
        System.out.println("here is your quote for "+insuranceName+" and "+carModel);
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName +"company is cancelled your insurance succesfully for your "+carModel);

    }
}
class Pet extends Insurance{
String petType;

    Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName+" company has a quote for your "+petType);

    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" company is canncelled your "+petType+" insurance");

    }
}
class Health extends Insurance{
   Health(String insuranceName){
       super(insuranceName);
   }
    @Override
    void getQuote() {
        System.out.println(insuranceName+" company has a quote for your health insurance");
    }

    @Override
    void cancelInsurance() {
        System.out.println(insuranceName+" company is cancelled your health insurance!");

    }
}
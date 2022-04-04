package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class Task3 {
    public static void main(String[] args) {
        /*
        Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as
        getQuote and cancelInsurance. Create 3 subclasses Car,Pet, Health.
        Car class has it’s own attribute as carModel and Class Pet has petType attribute.
        Create 3 objects of the sub classes and store them in ArrayList.
        Using for loop/advanced for loop/ iterator access all methods of the class.
         */
        ArrayList<Insurance> insurances=new ArrayList<>();
        insurances.add(new Pet("geico", "domestic short hair"));
        insurances.add(new Car("geico","toyota rav4"));
        insurances.add(new Health("bluecroos capital"));
        for (Insurance insurance: insurances){
         insurance.getQuote();
         insurance.cancelInsurance();
        }
        Iterator<Insurance> iterator=insurances.iterator();
        while(iterator.hasNext()){
          Insurance insurance=  iterator.next();
          insurance.getQuote();
          insurance.cancelInsurance();

        }
    }
}
abstract class Insurance{
    //when there is unimplemented behaviours we will use "abstract class" so class must be abstract and method should be
    //abstract and can not have body{}
    String insuranceName;
    Insurance(String insuranceName){
        this.insuranceName=insuranceName;

    }
    public abstract void getQuote();
    public abstract void cancelInsurance();
    }
    class Car extends Insurance{
    String carModel;


        Car(String insuranceName, String carModel) {
            super(insuranceName);
            this.carModel=carModel;
        }

        @Override
        public void getQuote() {
            System.out.println("getting quote for a car"+carModel);

        }

        @Override
        public void cancelInsurance() {
            System.out.println("cancelling insurance of my car"+carModel);

        }

        @Override
        public String toString() {
            return "Car{" +
                    "insuranceName='" + insuranceName + '\'' +
                    ", carModel='" + carModel + '\'' +
                    '}';
        }
    }
    class Pet extends Insurance{
    String petType;

        Pet(String insuranceName, String petType) {
            super(insuranceName);
            this.petType=petType;
        }
        @Override
        public void getQuote() {
            System.out.println("getting the quote for the pet"+ petType);
        }

        @Override
        public void cancelInsurance() {
            System.out.println("cancelling the insurance for my pet"+petType);

        }
    }
    class Health extends  Insurance{

        Health(String insuranceName) {
            super(insuranceName);
        }

        @Override
        public void getQuote() {
            System.out.println("getting quote Health ");
        }

        @Override
        public void cancelInsurance() {
            System.out.println("cancelling the health insurance");

        }
    }

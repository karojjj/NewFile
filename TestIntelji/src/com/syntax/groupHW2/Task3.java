package com.syntax.groupHW2;
/*
Create  a  Class  Car  that  would  have  the
following  fields:  carPrice  and  color  and method calculateSalePrice() which should be
returning a price of the car.
Create 2 sub classes: Sedan and Truck. The Truck  class  has  field  as  weight  and  has  its
own implementation of  calculateSalePrice() method in which returned price calculated as
following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
The Sedan class has field as length and also does  it  is  own  implementation  of calculateSalePrice(): if length of
sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
 */
public class Task3 {
    public static void main(String[] args) {
     Car[] cars={new Sedan(), new Truck()};
     for(Car car:cars) {
         //car.calculateSalePrice(2000);
         System.out.println(car.calculateSalePrice(2000, "white truck"));
         System.out.println(car.calculateSalePrice(10, "black sedan "));
     }}}
interface Car{
    double carPrice = 0;
    String color = null;
    double calculateSalePrice(double carPrice, String color);
}
class Sedan implements Car{
 double length;
    @Override
    public double calculateSalePrice(double carPrice, String color) {
        if(length>20){
            return +carPrice*0.05;
        }else {
            return carPrice * 0.10;
        }}}
class Truck implements Car{
    double weight;
    @Override
    public double calculateSalePrice(double carPrice, String color) {
        if (weight>2000){
            return (carPrice*0.10);
        }else {
            return (carPrice * 0.20);
        }}}
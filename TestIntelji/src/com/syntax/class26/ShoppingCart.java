package com.syntax.class26;

public class ShoppingCart {
    //encapsulation example so thats why fields are orivate and we used getter and setter method
    private double originalPrice=100;
    private double discount = .15;

    void setDiscount(double discount){
        if(discount>0&&discount<=.15){
            this.discount=discount;
        }else {
            System.out.println("Can't have that much discount");
        }
    }
    public double getDiscount(){
        return discount;
    }
    void calculatePrice() {
        double price = originalPrice - (originalPrice * discount);
        System.out.println(price);
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
       // shoppingCart.originalPrice=100;
        //shoppingCart.discount=.20;
      //  shoppingCart.setDiscount(.10);
        System.out.println(shoppingCart.getDiscount());
        shoppingCart.calculatePrice();
    }
    }
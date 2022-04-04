package com.syntax.class18;

public class ShoppingStore {

	//Create variables 
    String item;
    double price;
    int quantity;
    ShoppingStore(String item,double price,int quantity){  //Create a constructor to initialize instance variables.
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    double itemTotalPrice(){ //Create a method with name itemTotalPrice.
      return price*price;  //return the total value.
    }
}
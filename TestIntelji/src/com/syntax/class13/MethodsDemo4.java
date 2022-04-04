package com.syntax.class13;

public class MethodsDemo4 {
  //create a method that takes a boolean isSaleOn, double price, double discount
	//if isSaleOn=true return discounted price otherwise return original price
	
	double checkDiscount(boolean isSaleOn, double originalPrice, double discount) {
		if(isSaleOn) {
			return  (originalPrice-originalPrice*discount);
		}else {
			return originalPrice;
		}
	}
	void methodWithoutParameters() {
		
	}
	
	public static void main(String[]args) {
		
		MethodsDemo4 obj4=new MethodsDemo4();
		
		System.out.println(obj4.checkDiscount(false, 100,.15));
		System.out.println(obj4.checkDiscount(true, 100,.15));
	
		}
	}


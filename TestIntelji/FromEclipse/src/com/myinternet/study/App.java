package com.myinternet.study;

public class App {
        
        
	public static void main(String[] args) {
		CreditCard card1 = new CreditCard();
        card1.name="Medine";
        card1.lastName="Kaya";
        card1.cardName="Amex";
        card1.cardNumber=123456789;
        card1.expiDate=2028;
        card1.secNumber=890;
        card1.cardBalance=15000;
        card1.apr=24.9;
        card1.autopay=true;
       System.out.println(card1.name+" "+card1.lastName);
       
       Book book1=new Book("Harry Potter","JK Rowling",500, "English");
     
       
       Book book2=new Book("Happiness", "Zulfu Livaneli", 234, "Turkish");
      

       System.out.println(book1.title);
       
        
	}

}

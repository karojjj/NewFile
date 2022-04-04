package com.syntax.class18;

public class Account {
   private String username="teyfur";
   private String password="admin";
   public   String accountNumber="112458";
   private double balance=1500;
   
   void printUserName() {
	   System.out.println(username);
   }
   protected void printPassword() {
	   System.out.println(password);
   }
   void printBalance() {
	   System.out.println(balance);
   }
   public void printAccountNumber() {
	   System.out.println(accountNumber);
   }
     
   
	public static void main(String[] args) {
		Account account=new Account();
		System.out.println(account.username);
		System.out.println(account.password);
		System.out.println(account.balance);
		System.out.println(account.accountNumber);
		System.out.println("-------------------");
		account.printBalance();
		account.printAccountNumber();
		account.printPassword();
		account.printUserName();
		
		

	}

}

package com.syntax.class25;

public class BankAccount {
   private double balance=12345;
   private String userName="medine";
   private String password="Medine20202";
   //how to create a setter and getter method ?right click then select "get and setter", then we will get below methods

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    void printBalance(String userName, String password){
       if (userName.equals(this.userName)  && password.equals(this.password)){
           System.out.println("your balance is "+balance );
       } else{
           System.out.println(-1);
       }

   }
}

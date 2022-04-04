package com.syntax.mypractice;
//Java Program to demonstrate the working of a banking-system
//where we deposit and withdraw amount from our account.
//Creating an Task class which has deposit() and withdraw() methods
public class PracticeClassEx {

    public static void main(String[] args) {
        Account a1=new Account();
        a1.insert(239, "medine", 2.45f);
        a1.deposit(345.2f);
        a1.checkDisplay();
        a1.withdraw(23f);
        a1.checkBalance();
    }
}
class Account {
    int acc_no;
    String name;
    float amount;
    //method to initialize object
    void insert(int a, String n, float amt){
        acc_no=a;
        name=n;
        amount=amt;
    }
    //deposit method
    void deposit(float amt){
        amount=amount+amt;
        System.out.println(amt+" deposited");
    }
    //withdraw method
    void withdraw( float amt){
        if(amount<amt){
            System.out.println("unsufficient balance");
        }else{
            amount=amount-amt;
            System.out.println(amt+" withdrawn");
        }
    }
    void checkBalance(){
        System.out.println("balance is : " +amount);
    }
    void checkDisplay(){
        System.out.println(acc_no+" "+name+" "+amount);
    }

}

package com.myinternet.study;

public class AbstractionExample3 {
    public static void main(String[] args) {
        Bank bank=new SBI();
        bank.getInterestRate();
        System.out.println("rate of interest is: "+bank.getInterestRate()+"%");
        Bank bank1=new PNB();
        bank1.getInterestRate();
        System.out.println("rate of interest is: "+bank1.getInterestRate()+"%");
    }
}
abstract class Bank{
    abstract int getInterestRate();
}
class SBI extends Bank{
    @Override
    int getInterestRate() {
        return 7;
    }
}
class PNB extends Bank{
    @Override
    int getInterestRate() {
        return 9;
    }
}
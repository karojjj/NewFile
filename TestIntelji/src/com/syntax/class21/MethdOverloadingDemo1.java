package com.syntax.class21;

public class MethdOverloadingDemo1 {
    public static void main(String[] args) {
    add(10);
    add(10, 10);
    add(10, 20,30, 45, 586);

}
static void add(int ...numArray){ // instead of overloading method we can
    int sum=0;
    for(int num:numArray){
        sum+=num;
    }
    System.out.println(sum);
    }
}

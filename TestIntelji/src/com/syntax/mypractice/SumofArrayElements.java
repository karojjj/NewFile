package com.syntax.mypractice;

public class SumofArrayElements {
    public static void main(String[] args) {
        //an array of numbers
        int [] numbers={3, 4, 5, 6, -6, 9, 11};
        int sum=0;
        //iterating through each element of array
        for (int num:numbers){
            sum+=num;
        }
        System.out.println(sum);
    }
}

package com.syntax.mypractice;

public class DisplayFibonacciSeriesUsingforLoop {
    public static void main(String[] args) {
        /*
        Fibonacci Series: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
Suppose, our first two terms are:
a=  0
b = 1
The next terms in the Fibonacci series would be calculated as:
c=a+b;
a=b;
b=c;
         */
        int n = 10, firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
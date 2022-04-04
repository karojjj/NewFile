package com.replit.exercises;
import java.util.ArrayList;
import java.util.Scanner;
public class Replit188 {
    public static void main(String[] args) {
        /*
        Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
Numbers in:4 62 8 5 4
         */
        Scanner input=new Scanner(System.in);
        input.nextInt();
        ArrayList<Integer> numbers=new ArrayList<>();
         for(int i=0; i<=5; i++){
          numbers.add(input.nextInt());
         }
   input.close(); //good practice to save memory
        for(Integer num:numbers){
            System.out.println(num+" ");
        }
    }
}

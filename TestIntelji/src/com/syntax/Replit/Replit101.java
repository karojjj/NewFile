package com.syntax.Replit;
import java.util.Scanner;
public class Replit101 {
    public static void main(String[] args) {
        /*
        Inputs:

String word;
String word;
Write a for loop that will print out every other letter in a String, starting with the first letter.
These letters should be printed all on one line with no space in between.
         */

        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int i=0; i<word.length();i+=2) {
            //access each character

            char a=word.charAt(i);
            System.out.print(a);
        }
    }
}




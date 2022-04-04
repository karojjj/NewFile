package com.replit.exercises;

import java.util.ArrayList;

public class Replit187 {
    public static void main(String[] args) {
        /*
        Create an array list to type String.Add these values below to your arraylist
hi
yo
sup
yolo
boop
Remove 1, 3, 5 element from an array
print remained values one by one in one line
         */
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("hi");
        arrayList.add("yo");
        arrayList.add("sup");
        arrayList.add("yolo");
        arrayList.add("boop");
        System.out.println(arrayList.size()); //5

        arrayList.remove(0);
        arrayList.remove(1);
        arrayList.remove(2);
        for(String arr:arrayList){
            System.out.print(arr+" ");
        }





    }
}

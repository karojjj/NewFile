package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HowToLoopArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist=new ArrayList<>();
        arrlist.add(12);
        arrlist.add(120);
        arrlist.add(132);
        arrlist.add(142);
        arrlist.add(162);
        arrlist.add(112);
        //for loop for iterating ArrayList
        System.out.println("for loop");

        for (int i=0; i< arrlist.size(); i++){
            System.out.println(arrlist.get(i));
        }

        //advanced for loop
        System.out.println("advanced for loop");
        for(Integer arr:arrlist){
            System.out.println(arr);
        }
        //looping ArrayList using Iterator
        System.out.println("iterator");
        Iterator iterator= arrlist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());

            }


            }
        }


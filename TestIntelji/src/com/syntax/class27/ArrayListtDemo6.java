package com.syntax.class27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListtDemo6 {
    public static void main(String[] args) {
        List<String> groceries= Arrays.asList("banana", "apple", "onion", "carrot");
  //syntax is List<String> nameofVariable=Arrays.asList();
        System.out.println(groceries);

        ArrayList<String>  list2=new ArrayList<>();
       list2.add("Apple");
       list2.add("Onion");

        System.out.println(groceries.containsAll(list2));
    }
}

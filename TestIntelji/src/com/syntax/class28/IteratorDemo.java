package com.syntax.class28;

import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<String> courses=new LinkedList<>();
        courses.add("SDLC");
        courses.add("Manual Testing");
        courses.add("JAVA");
        courses.add("JAVA");
        courses.add("Selenium");
       // for(int i=0; i< courses.size(); i++){
           // if (courses.get(i).equals("JAVA")){  //so compile will give error because we remove java elements index 2 and 3
            //    //so the size element is not 5 anymore it is 3 thats why for loop we can not loop 5 times iste oyle boyle :)
              //  courses.remove("JAVA");
           // }
       // }
       /* for (String course:courses){
            if(course.equalsIgnoreCase("java")){
                courses.remove(course);
            }
        } */
    }
}

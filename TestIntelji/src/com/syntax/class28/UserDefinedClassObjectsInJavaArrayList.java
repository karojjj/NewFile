package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedClassObjectsInJavaArrayList {
    public static void main(String[] args) {
        Studenttt s1=new Studenttt(101, "med", 23);
        Studenttt s2=new Studenttt(102, "arin", 25);
        Studenttt s3=new Studenttt(103, "berfin", 20);
        ArrayList<Studenttt> hi=new ArrayList<Studenttt>();
        hi.add(s1);
        hi.add(s2);
        hi.add(s3);
        Iterator itr=hi.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Studenttt st=(Studenttt) itr.next();
            System.out.println(st.rollno+ " "+st.age+" "+st.name);
        }

    }
}
class Studenttt{
    int rollno;
    String name;
    int age;
    Studenttt(int rollno, String name, int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }

}
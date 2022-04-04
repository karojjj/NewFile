package com.syntax.class19;

public class Practice3 {
       String studentName;
       String course;
       int studentId;
       int grades;
       void displayStudentsRecord(){
           System.out.println("the student name is: "+studentName+" and the course student enrolled for is "+course);
           System.out.println("The student is id: "+ studentId+ " and the grades student achieved are "+grades);
       }

    public static void main(String[] args) {
           //creating the first object of class to assign first set of values
           Practice3 object=new Practice3();
           object.studentName="medine";
           object.studentId=123;
           object.grades=65;
           object.course="SDET";
           object.displayStudentsRecord();

        System.out.println("------------------------------");
        //creating the second object of class to assign first set of values
        Practice3 object1=new Practice3();
        object1.studentName="arin";
        object1.studentId=1234567;
        object1.grades=95;
        object1.course="SDET";
        object1.displayStudentsRecord();

    }
}

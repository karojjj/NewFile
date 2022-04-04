package com.syntax.class18;

public class Students {
	String name;  //instant variable
	String id;    //instant variable
	static int  numberOfStudents;

	public static void main(String[] args) {
		/*
		 * HomeWork Create a Class called Students
		 *  Create three variables Name , ID and numberOfStudents 
		 *  Create three objects of the Students Class
		 *   Set the value for studentName , studentID 
		 *   and increment the numberOfStudents for each object
		 * Print out total number of students
		 */
       Students student1=new Students();
       student1.name="yazgul";
       student1.id="123";
       Students.numberOfStudents++; //because it was static. And we are adding new students everytime.We increment number of students
      
       
       Students student2=new Students();
       student2.name="arin";
       student2.id="456";
       Students.numberOfStudents++;
       
       Students student3=new Students();
       student3.name="mahmut";
       student3.id="980";
       Students.numberOfStudents++;
       
       System.out.println(Students.numberOfStudents);
       
	}

}

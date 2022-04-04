package com.syntax.class12;

public class App {

	public static void main(String[] args) {
	 
		Student mystudent1 = new Student();
         mystudent1.name="Medine";
         mystudent1.lastname="Kaya";
         mystudent1.age=29;
         mystudent1.gpa=3.88;
         mystudent1.sex='F';
         mystudent1.studentID=123456;
         mystudent1.major="Business";
         mystudent1.graduated=true;
         System.out.println(mystudent1.name);
         System.out.println(mystudent1.lastname);
         System.out.println(mystudent1.age);
         System.out.println(mystudent1.gpa);
         System.out.println(mystudent1.sex);
         System.out.println(mystudent1.studentID);
         System.out.println(mystudent1.major);
         System.out.println(mystudent1.graduated);
         
         
         System.out.println("------------------------");
         Student mystudent2 = new Student();
         mystudent2.name="Arin";
         mystudent2.lastname="Kaya";
         mystudent2.age=23;
         mystudent2.gpa=3.00;
         mystudent2.sex='M';
         mystudent2.studentID=123456;
         mystudent2.major="Vets";
         mystudent2.graduated=true;
        
         System.out.println(mystudent2.name);
         System.out.println(mystudent2.lastname);
         System.out.println(mystudent2.age);
         System.out.println(mystudent2.gpa);
         System.out.println(mystudent2.sex);
         System.out.println(mystudent2.studentID);
         System.out.println(mystudent2.major);
         System.out.println(mystudent2.graduated);
         
	}

}

package com.syntax.class14;

public class Task6 {

	char getGrade(int score) {
		if (score>=90) {
			return 'A';
		}else if(score>=80 && score<90) {
			return 'B';
		}else if(score>=70 && score<80) {
			return 'C';
		}else if(score>=50 && score<70) {
			return 'D';
		} else {
			return'F';
		}}
	public static void main(String[] args) {
		/*
		 * create class "student" that will have a method getGrade.Your method should
		 * accept the score of a student and return grade: score>90=A score>80=C
		 * score>70=C score>50=D anything else=F Task6=Student
		 */
		Task6 object = new Task6();
		object.getGrade(0);
		System.out.println(object.getGrade(90));
	}

}

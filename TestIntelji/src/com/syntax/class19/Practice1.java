package com.syntax.class19;

public class Practice1 {
    //attributies
    String empName="Tarik";
    int empId=12345;
    String group;
// object and class practice
        void employeeDetails() { // this method is not going to return anything
            System.out.println("this method shows the details of the employee");

        }
        void employeeGroup(){
            System.out.println("this method shows the group of the employee");
        }

    public static void main(String[] args) {
        Practice1 obj=new Practice1();
        obj.employeeGroup();
        obj.employeeDetails();
    }
    }


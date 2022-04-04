package com.syntax.mypractice;

public class Ex3 {
    String createEmail(String userName, String lastName, String emailType){
        return userName+lastName+"@"+emailType+".com";
}

    public static void main(String[] args) {
        // Create a method createEmail(). Based on values of users name, lastName and
        // email type, your method should return complete email Address. Example:
        // createEmail(John, Snow, gmail) → johnsnow@gmail.com or

        Ex3 object=new Ex3();
        System.out.println(object.createEmail("medine","kaya","gmail"));
    }}
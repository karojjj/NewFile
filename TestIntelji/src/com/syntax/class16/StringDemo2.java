package com.syntax.class16;

public class StringDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="12345610!#$%^&aksalajdlkjkjsdafAJASFDHFKJDS";
         String str1=str.toLowerCase();
         String str2=str.toUpperCase();
         System.out.println(str.replaceAll("[0-9]", "#"));
         System.out.println(str.replaceAll("[0-4]", ""));
         System.out.println(str.replaceAll("[a-z]", ""));
         System.out.println(str.replaceAll("[A-Z]", " "));
         System.out.println(str1.replaceAll("[A-Z]", " "));
         System.out.println(str2.replaceAll("[A-Z]", " "));
         System.out.println(str.replaceAll("[!-/]", " "));
         System.out.println(str.replaceAll(str1, str2));
         
	}

}

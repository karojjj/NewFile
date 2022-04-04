package com.syntax.reviewclass;

public class StringClass3 {
    public static void main(String[] args) {
        String batch="Batch 12";
        String course="SDET";
        String company="                         Sntax       Tech                     ";
        if ("Batch 12".equalsIgnoreCase(batch) && "SDET".equalsIgnoreCase(course)){
            System.out.println("you will get the link to MS' lecture ");
        }else{
            System.out.println("watch my youtube channel");
        }
        System.out.println(company.trim()); //trim(); methods only removes starting and ending spaces
        System.out.println(company.trim().replace(" ","")); //here we removed start and end spaces with
        // trim(); method also used replace(); method we replaced space with no space
        String name1=" nasir gopi krishan kashtabai rammakrishan";
        name1.replaceAll(" ", "");
        System.out.println(name1.replaceAll(" ", ""));
    }
}

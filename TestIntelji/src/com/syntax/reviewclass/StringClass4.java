package com.syntax.reviewclass;

public class StringClass4 {
    public static void main(String[] args) {
        String message="This is great batch in dreams";
        System.out.println(message.replaceAll("dreams", "real life"));
        for(int i=0; i<message.length(); i++){
            System.out.print(message.charAt(i)+" ");

        }}
    }


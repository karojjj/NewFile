package com.syntax.class09;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String[] cities= {"Washington DC", "Boston", "Miami","Los Angeles","New York"};
     
     // if value is Miami==>I want to leave in Miami
     for (int a=0; a<cities.length;a++) {
    	 System.out.println(cities[a]+" ");
    	 if (cities[a].equals("Miami")) {
    		 System.out.println("I want to leave in Miami");
    	 }
    	
    	 
     }
	}

}

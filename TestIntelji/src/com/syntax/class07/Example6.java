package com.syntax.class07;

public class Example6 {

	public static void main(String[] args) {
		
		for(int a=0; a<100; a++) {
			System.out.print(a+" ");
		} 
          System.out.println("loop finished");
          
          System.out.println("for even numbers use b+=2");
          
          for ( int b=0; b<100; b+=2) {
        	  System.out.print(b+" ");

          }
          System.out.println("if you want to increase number +3 , use c+=3");
          for (int c=0; c<100; c+=3) {
        	  System.out.print(c+" ");
          }
          System.out.println("==================");
          for (int c=0; c<100; c+=5) {
        	  System.out.print(c+" ");
	}

}
}

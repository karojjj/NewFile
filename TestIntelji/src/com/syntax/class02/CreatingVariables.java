package com.syntax.class02;

public class CreatingVariables {

	public static void main(String[] args) {
		/* create variable and assign value
		 * 
		 * declare a variable( left) and initialize(right) linke int age ; it is declaration =25 is variable
		*/
		//first way to declare a variable and initialize (happens only one)it
		int age=25; // inside the box named age , we have 25
		// second way to do it 
		int num; // declare variable
	    num=10;   //initialize it
		num=100; //reassign the value		
	    System.out.println(num);
		int n1, n2, n3;   //most used depend on assignment all 3 variables are on the int type
	    n1=10;
	    n2=20;
	    n3=30;
	    System.out.println(n1);
	    System.out.println(n2);
	    System.out.println(n3);
	   //ctrl+d --> will remove enter line
	    //can i change a value of the variable? variable is a place holder or container
	   
	    age=26; // reassigning the value of variable age. it was age=25;
	   // age=26.5; ERROR: age variable can hold only int value
	    age=70;
	    System.out.println(age); // we see  latest value in the console 70
        age=100;
        System.out.println(age); // we see  latest value in the console 100
        
       // boolean break=false; // error: break is key words for java
        
        boolean Break=true;  // no error because Break(starts upper case no meaning for java
        //vaariables names hsould start lower case , we can use upper case as well but it is not preferable
        System.out.println(Break);
        
        boolean break1=true; // no error because we specified the name of break like break1
       
        System.out.println(break1);
        
       // char 1character='A'; // NOT USE IDENTIFIERS , NOT START identifier name with the number
        
        char character1='A'; //you can specialize the name not add number in the beginning
	
	    // double %value=12.99; -->do not start name with speacial character
        //Java allows to use _ underscore or $dollar as a identifier
        double _value=2.99; // it can be used but it is not useful to use it (_ or$)
        double $price=1.99;
        //name should start lower case-->naming convention'Java Standards 
        /*variables and methods names should start with lower case
         * give variable a meaningful name 
         * class name should start with UPPER CASE
         * if name has 2 or more words, follow camel casing like==> MedineKayaProject
         */
	
	int BigNumber=12234; //name is not preferable it can be bignumber
	int bignumber=12347;
	
	
	
	}

}

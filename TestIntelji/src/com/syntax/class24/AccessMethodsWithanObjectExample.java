package com.syntax.class24;

public class AccessMethodsWithanObjectExample {
public void fullThrottle(){
    System.out.println("The car is going as fast as it can!");
}
public void speed(int maxSpeed){ //  // Create a speed() method and add a parameter

    System.out.println("Max speed is: " + maxSpeed);
}

    public static void main(String[] args) {
        //Create a Car object named myCar.
        // Call the fullThrottle() and speed() methods on the myCar object, and run the program:

        //NOT: By using the new keyword we created an object with the name myCar.
        AccessMethodsWithanObjectExample mycar=new AccessMethodsWithanObjectExample(); // Create a myCar object
        mycar.fullThrottle(); // Call the fullThrottle() method
        mycar.speed(120);//call the speed() method
    }
}

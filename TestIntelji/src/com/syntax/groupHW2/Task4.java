package com.syntax.groupHW2;
/*
Create  Registration  Class  in  which  you would have variables as email, userName and password that have an access scope
only within its own class.
After creating an object of the class user should be able to call  methods  and  in  each  method
separately pass values to set users email,username and password.
Requirements:
A. Valid email consider to be only yahoo
B. Valid userName and password cannot be
empty and should be of length larger than
6 characters. Also valid password cannot
contain userName.
 */
public class Task4 {
    public static void main(String[] args) {
        Registration reg=new Registration();
        reg.setEmail("meddd@yahoo.com");
        reg.setPassword("123456");
        reg.setUsername("meddd");

    }
}
class Registration {
  private   String email;
   private  String password;
    private String username;
    public void setEmail(String email){
        this.email=email;
        //Valid email consider to be only yahoo
        if(email.contains("yahoo.com")){
            System.out.println("email is acceptable");
        } else{
            System.out.println("email can be only yahoo");
        }

    }
    public void setPassword(String password){
        this.password=password;
        //Valid  password cannot be
        //empty and should be of length larger than
        //6 characters. Also valid password cannot
        //contain userName
      if(!password.isEmpty()&& password.length()>=6 ){
          System.out.println("your password is created");
      }else if(password.contains(username)){
          System.out.println("password should not include username");

        }

    }
    public void setUsername(String username){
        this.username=username;
        //B. Valid userName  cannot be
        //empty and should be of length larger than
        //6 characters.
        if(username.isEmpty() && username.length()<=6){
            System.out.println("username is not acceptable");
        } else{
            System.out.println("username is acceptable");
        }

    }


}
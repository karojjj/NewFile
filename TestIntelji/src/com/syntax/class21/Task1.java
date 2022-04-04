package com.syntax.class21;


    /*
    Write program: userClass  that has a
constructor that initializes instance variable
name and mobile number. Create a subclass
userInfo that will have user address variable
and it also being initialized through
constructor call. Print users name, mobile
number and address in userDetails method.
Test your code
     */
    class UserClass{
        String name;
        String mobileNumber;
        UserClass(String name, String mobileNumber){
            this.name=name;
            this.mobileNumber=mobileNumber;
        }
    }
    class UserInfo1 extends UserClass {
        String address;

        UserInfo1(String name, String mobileNumber, String address) {
            super(name, mobileNumber);
            this.address = address;
        }

        void userDetails() {
            System.out.println(name + " " + mobileNumber + " " + address);

        }

    }
    public class Task1 {



    public static void main(String[] args) {
        UserInfo1 info=new UserInfo1("medine", "12345","USA");
        info.userDetails();

    }
}

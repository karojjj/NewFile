package com.syntax.class21;
//Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
// Create a subclass  userInfo that will have user address variable and
// it also being initialized through constructor call.
// Print users name, mobile number and address in userDetails method. Test your code.
public class User { //creating user clas
    String name;
    String mobileNumber;

    public User(String name, String mobileNumber) { //creating  a constructor that initializes instance variable name and mobile number.
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends User {
    String address;

    public UserInfo(String name, String mobileNumber){
    super(name, mobileNumber);

}
    public UserInfo(String name, String mobileNumber, String address){
        super(name, mobileNumber);
        this.address=address;
    }
    void userDetails() {
        System.out.println(name + " " + mobileNumber + " " + address);
    }
}
class TesterUser {

    public static void main(String[] args) {
        UserInfo user = new UserInfo("medine", "112-345-8383", "7373 st main");
        user.userDetails();
    }
}
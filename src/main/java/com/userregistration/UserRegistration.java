package com.userregistration;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To User Registration");
        Scanner sc=new Scanner(System.in);
        String firstName, lastName, emailId, mobileNumber,password;

        //Reference of interface
        Registration registration=new Name();
        System.out.println("Enter First Name : ");
        firstName=sc.nextLine();
        registration.validateUserDetails(firstName);

        System.out.println("Enter Last Name : ");
        lastName=sc.nextLine();
        registration.validateUserDetails(lastName);

        registration=new Email();
        System.out.println("Enter Email Id : ");
        emailId=sc.nextLine();
        registration.validateUserDetails(emailId);

        registration=new Mobile();
        System.out.println("Enter Mobile Number : ");
        mobileNumber=sc.nextLine();
        registration.validateUserDetails(mobileNumber);

        registration=new Password();
        System.out.println("Enter password having at least 8 characters and at least 1 Upper case letter : ");
        password=sc.nextLine();
        registration.validateUserDetails(password);

    }
}

package com.userregistration;

import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome To User Registration");
        Scanner sc=new Scanner(System.in);
        String firstName;
        String lastName;

        //Reference of interface
        Registration registration=new Name();
        System.out.println("Enter First Name : ");
        firstName=sc.nextLine();
        registration.validateUserDetails(firstName);

        System.out.println("Enter Last Name : ");
        lastName=sc.nextLine();
        registration.validateUserDetails(lastName);
    }
}

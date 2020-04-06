package com.userregistration;

/* Interface */
public interface Registration {
    void validateUserDetails(String details);
}

/* Class For Name */
class Name implements Registration {
    /* Validating User Name */
    public void validateUserDetails(String userName) {
        String NAME_PATTERN="^[A-Z][a-z]{2,}$";
        if(userName.matches(NAME_PATTERN)) {
            System.out.println("Valid Name");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}

/* Class for Email */
class Email implements Registration {
    /* Validating Email Id */
    public void validateUserDetails(String emailId) {
        String EMAIL_PATTERN = "^([a-zA-Z]{3,}([.|_|+|-]?[a-zA-Z0-9]+)?[@][a-zA-Z0-9]+[.][a-zA-Z]{2,3}([.]?[a-zA-Z]{2,3})?)$";
        if(emailId.matches(EMAIL_PATTERN)) {
            System.out.println("Valid Email Id");
        }
        else {
            System.out.println("Invalid Email Id");
        }
    }
}
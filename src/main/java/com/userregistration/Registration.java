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

/* Class for Mobile */
class Mobile implements Registration {
    /* Validating Mobile Format */
    public void validateUserDetails(String mobileNumber) {
        String MOBILE_NUMBER_PATTERN="^[0-9]{1,3}[' '][0-9]{10}$";
        if(mobileNumber.matches(MOBILE_NUMBER_PATTERN)) {
            System.out.println("Valid Mobile Number");
        }
        else {
            System.out.println("Invalid Mobile Number");
        }
    }
}

/* Class for Password */
class Password implements Registration {
    /* Validating password */
    public void validateUserDetails(String password) {
        String PASSWORD_AT_LEAST_ONE_NUMBER="((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z]).{8,20})";
        if(password.matches(PASSWORD_AT_LEAST_ONE_NUMBER)) {
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");
        }
    }
}


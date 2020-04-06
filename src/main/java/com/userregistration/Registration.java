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
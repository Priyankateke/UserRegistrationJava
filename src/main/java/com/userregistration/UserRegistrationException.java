package com.userregistration;

public class UserRegistrationException extends Exception {
    public enum ExceptionType {
        INVALID_DETAILS;
    }
    public final ExceptionType type;

    public UserRegistrationException(ExceptionType type,String message) {
        super(message);
        this.type=type;
    }
}

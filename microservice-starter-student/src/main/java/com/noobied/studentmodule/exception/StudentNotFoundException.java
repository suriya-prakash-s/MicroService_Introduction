package com.noobied.studentmodule.exception;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message, long id) {
        super(String.format("%s %s", message, id));
    }
}

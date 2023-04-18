package com.noobied.studentmodule.exception;

//User defined exception for Student not found
public class StudentNotFoundException extends RuntimeException{

    public StudentNotFoundException(String message) {
        super(message);
    }

    public StudentNotFoundException(String message, long id) {
        super(String.format("%s %s", message, id));
    }
}

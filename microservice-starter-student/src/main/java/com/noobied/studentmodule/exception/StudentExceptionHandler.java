package com.noobied.studentmodule.exception;

import com.noobied.studentmodule.dto.StudentDtoHandler;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//Global exception handler
@RestControllerAdvice
public class StudentExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<Object> handleStudentNotFoundException(StudentNotFoundException e){
        ResponseEntity<Object> student_not_found = StudentDtoHandler.responseBuilder("STUDENT NOT FOUND", e.getMessage(), HttpStatus.NOT_FOUND);
        return student_not_found;
    }
}

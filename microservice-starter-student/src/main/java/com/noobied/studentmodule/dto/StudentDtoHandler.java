package com.noobied.studentmodule.dto;

import com.noobied.studentmodule.entity.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

//DTO handler class to build the response
public class StudentDtoHandler {

    public static ResponseEntity<Object> responseBuilder(String message, Object data, HttpStatus status) {
        Map<String, Object> response = new HashMap<>();
        response.put("message",message);
        response.put("data", data);
        response.put("status", status);
        return new ResponseEntity<>(response, status);
    }

}

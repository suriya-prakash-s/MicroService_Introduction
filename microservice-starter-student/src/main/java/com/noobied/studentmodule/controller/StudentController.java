package com.noobied.studentmodule.controller;

import com.noobied.studentmodule.dto.StudentDTO;
import com.noobied.studentmodule.dto.StudentDtoHandler;
import com.noobied.studentmodule.entity.Student;
import com.noobied.studentmodule.exception.StudentNotFoundException;
import com.noobied.studentmodule.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Student controller to handle rest api
@RestController
@RequestMapping("/api/student")
public class StudentController {
    //StudentService obj autowired
    @Autowired
    private StudentService service;
    //Get Mapping to handle the get all students request
    @GetMapping("/")
    public ResponseEntity<Object> getAllStudents() {
        List<StudentDTO> allStudents = service.getAllStudents();
        ResponseEntity<Object> all_student_details = StudentDtoHandler.responseBuilder("ALL STUDENT DETAILS",
                allStudents, HttpStatus.OK);
        return all_student_details;
    }
    //Get mapping to handle find student by Id request
    @GetMapping("/{id}")
    public ResponseEntity<Object> getStudentById(@PathVariable("id") long id){
            StudentDTO studentById = service.findStudentById(id);
            ResponseEntity<Object> student_found = StudentDtoHandler.responseBuilder("STUDENT FOUND", studentById, HttpStatus.FOUND);
            return student_found;
    }

}

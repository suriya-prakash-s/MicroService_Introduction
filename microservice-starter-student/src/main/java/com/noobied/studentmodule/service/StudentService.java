package com.noobied.studentmodule.service;

import com.noobied.studentmodule.entity.Student;

import java.util.List;

//Service interface for operations
public interface StudentService {
    //abstract method to find student by id
    Student findStudentById(long id);
    //abstract method to get all students
    List<Student> getAllStudents();
}

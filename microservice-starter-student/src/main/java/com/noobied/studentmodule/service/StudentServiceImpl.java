package com.noobied.studentmodule.service;

import com.noobied.studentmodule.entity.Student;
import com.noobied.studentmodule.exception.StudentNotFoundException;
import com.noobied.studentmodule.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    //StudentRepository obj autowired
    @Autowired
    private StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }
    //find student by id impl
    @Override
    public Student findStudentById(long id) {
        return repository.findById(id)
                .orElseThrow(()->new StudentNotFoundException("Requested Student NOT FOUND for id",id));
    }
    //get all student impl
    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }
}

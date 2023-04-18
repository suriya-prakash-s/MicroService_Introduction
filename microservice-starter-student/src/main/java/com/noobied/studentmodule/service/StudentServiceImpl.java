package com.noobied.studentmodule.service;

import com.noobied.studentmodule.dto.StudentDTO;
import com.noobied.studentmodule.entity.Student;
import com.noobied.studentmodule.exception.StudentNotFoundException;
import com.noobied.studentmodule.repository.StudentRepository;
import com.noobied.studentmodule.utility.StudentDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentServiceImpl implements StudentService {
    //StudentRepository obj autowired
    @Autowired
    private StudentRepository repository;
    //StudentDtoMapper obj autowired
    @Autowired
    private StudentDtoMapper entityToDto;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }
    //find student by id impl
    @Override
    public StudentDTO findStudentById(long id) {
        Optional<Student> studentById = repository.findById(id);
        if(studentById.isPresent()){
            return (entityToDto.convertEntityToDTO(studentById.get()));
        }else {
            throw new StudentNotFoundException("Student NOT FOUND for given ID", id);
        }
    }
    //get all student impl
    @Override
    public List<StudentDTO> getAllStudents() {
        List<Student> allStudents = repository.findAll();
        List<StudentDTO> studentDTOs = allStudents.stream()
                .map(student -> entityToDto.convertEntityToDTO(student))
                .collect(Collectors.toList());
        return studentDTOs;
    }
}

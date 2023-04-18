package com.noobied.studentmodule.utility;

import com.noobied.studentmodule.dto.StudentDTO;
import com.noobied.studentmodule.entity.Student;

//Mapper class to map Entity to DTO
public class StudentDtoMapper {
    public StudentDTO convertEntityToDTO(Student entity){
        StudentDTO dto = new StudentDTO(entity.getId(), entity.getFname(), entity.getLname());
        return dto;
    }

}

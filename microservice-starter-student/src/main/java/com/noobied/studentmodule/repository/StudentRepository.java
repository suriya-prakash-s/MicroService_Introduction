package com.noobied.studentmodule.repository;

import com.noobied.studentmodule.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

//Repository interface to perform DB operation
public interface StudentRepository extends JpaRepository<Student, Long> {
}

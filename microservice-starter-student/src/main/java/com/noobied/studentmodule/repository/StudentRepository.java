package com.noobied.studentmodule.repository;

import com.noobied.studentmodule.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Repository interface to perform DB operation
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

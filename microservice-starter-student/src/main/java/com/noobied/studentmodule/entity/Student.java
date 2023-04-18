package com.noobied.studentmodule.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//Student entity class with id, fname, lname as attributes
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student {
    //student_id serves as a primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private long id;
    //column first_name to store student first name
    @Column(name = "first_name", nullable = false)
    private String fname;
    //column last_name to store student last name
    @Column(name = "last_name", nullable = false)
    private String lname;

}

package com.vasanth.sms.service;

import com.vasanth.sms.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> getAllStudents();

    Student findStudent(long id);

    Student saveStudent(Student student);

    void delStudent(long id);

}

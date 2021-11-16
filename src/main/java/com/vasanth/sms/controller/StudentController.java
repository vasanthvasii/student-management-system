package com.vasanth.sms.controller;

import com.vasanth.sms.entity.Student;
import com.vasanth.sms.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {
    
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    
    @GetMapping("/students")
    public List<Student> listStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student retrieveStudent(@PathVariable long id){
        return studentService.findStudent(id);
    }
    @PostMapping("/students")
    public Student addStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable long id){
        studentService.delStudent(id);
    }

    @PostMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student){
        Student existingStudent=studentService.findStudent(id);
        existingStudent.setId(id);
        existingStudent.setFirstname(student.getFirstname());
        existingStudent.setLastname(student.getLastname());
        existingStudent.setEmail(student.getEmail());

        return studentService.saveStudent(existingStudent);
    }
}

package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public List<Student>getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/{id}")
    public Student getStudentByRollNo(@PathVariable Integer id){
        return studentService.getStudentById(id);
    }
    @PostMapping
    public String  addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @PutMapping
    public String  updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }
    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable Integer id){
        return studentService.deleteStudentById(id);
    }
    @DeleteMapping
    public String deleteAllStudents(){
        return studentService.deleteAllStudents();
    }
    


}

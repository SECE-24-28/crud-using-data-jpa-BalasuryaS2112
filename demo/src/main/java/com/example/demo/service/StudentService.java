package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
    public Student getStudentById(Integer id){
        Optional<Student> studentOptional = studentRepository.findById(id);
        if(studentOptional.isPresent()){
            return studentOptional.get();
        }
        return new Student();
    }
    public String addStudent(Student student){
        studentRepository.save(student);
        return "Student added successfully";
    }
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Student updated successfully";
    }
    public String deleteStudentById(Integer id){
        studentRepository.deleteById(id);
        return "Student deleted successfully";
    }
    public String deleteAllStudents(){
        studentRepository.deleteAll();
        return "All students deleted successfully";
    }
    
}

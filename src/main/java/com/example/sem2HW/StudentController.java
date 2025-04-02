package com.example.sem2HW;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class StudentController {

    private StudentRepository repository;

    @Autowired
    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id){
        return repository.getStudentById(id);
    }

    @GetMapping("/group/{group}")
    public List<Student> etAllStudentsInGroup(@PathVariable String group){
        return repository.getAllStudentsInGroup(group);
    }

    @GetMapping("/students/search")
    public Student getStudentByName(@RequestParam String name){
        return repository.getStudentByName(name);
    }

    @PostMapping("/students")
    public Student addNewStudent(@RequestBody Student student){
        Student newStudent = repository.addStudent(student);
        return  student;
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(int id){
        repository.deleteStudent(id);
    }


}

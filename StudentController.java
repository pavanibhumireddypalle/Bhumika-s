package com.example.studentmanagement.controller;
import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins="*")
public class StudentController {
 private final StudentService service;
 public StudentController(StudentService service){this.service=service;}
 @GetMapping public List<Student> all(){return service.getAll();}
 @PostMapping public void add(@RequestBody Student s){service.save(s);}
 @DeleteMapping("/{id}") public void delete(@PathVariable int id){service.delete(id);}
}
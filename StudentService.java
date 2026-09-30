package com.example.studentmanagement.service;
import com.example.studentmanagement.model.Student;
import com.example.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
 private final StudentRepository repo;
 public StudentService(StudentRepository repo){this.repo=repo;}
 public List<Student> getAll(){return repo.findAll();}
 public void save(Student s){repo.save(s);}
 public void delete(int id){repo.delete(id);}
}
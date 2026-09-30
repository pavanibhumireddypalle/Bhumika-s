package com.example.studentmanagement.repository;
import com.example.studentmanagement.model.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
@Repository
public class StudentRepository {
 private final JdbcTemplate jdbc;
 public StudentRepository(JdbcTemplate jdbc){this.jdbc=jdbc;}
 public List<Student> findAll(){return jdbc.query("SELECT * FROM student",
  (rs,n)->new Student(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getString("course")));}
 public int save(Student s){return jdbc.update("INSERT INTO student(name,age,course) VALUES(?,?,?)",s.getName(),s.getAge(),s.getCourse());}
 public int delete(int id){return jdbc.update("DELETE FROM student WHERE id=?",id);}
}
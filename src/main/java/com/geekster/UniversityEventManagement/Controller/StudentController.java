package com.geekster.UniversityEventManagement.Controller;


import com.geekster.UniversityEventManagement.Department;
import com.geekster.UniversityEventManagement.Model.Student;
import com.geekster.UniversityEventManagement.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> addStudent(@Valid @RequestBody Student student) {
        Student savedStudent = studentService.addStudent(student);
        return ResponseEntity.ok(savedStudent);
    }

    @PutMapping("/{studentId}/department")
    public ResponseEntity<Void> updateStudentDepartment(@PathVariable long studentId, @RequestParam Department department) {
        studentService.updateStudentDepartment(studentId, department);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable long studentId) {
        studentService.deleteStudent(studentId);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = studentService.getAllStudents();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable long studentId) {
        Student student = studentService.getStudentById(studentId);
        return ResponseEntity.ok(student);
    }
}

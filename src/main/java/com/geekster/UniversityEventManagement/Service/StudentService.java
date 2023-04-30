package com.geekster.UniversityEventManagement.Service;

import com.geekster.UniversityEventManagement.Department;
import com.geekster.UniversityEventManagement.Model.Student;
import com.geekster.UniversityEventManagement.Repository.StudentRepository;
import com.geekster.UniversityEventManagement.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student updateStudentDepartment(long studentId, Department department) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + studentId));
        student.setDepartment(department);
        return studentRepository.save(student);
    }

    public void deleteStudent(long studentId) {
        if (!studentRepository.existsById(studentId)) {
            throw new ResourceNotFoundException("Student not found with id " + studentId);
        }
        studentRepository.deleteById(studentId);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + studentId));
    }
}

package com.geekster.UniversityEventManagement.Repository;

import com.geekster.UniversityEventManagement.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}

package com.geekster.UniversityEventManagement.Model;

import com.geekster.UniversityEventManagement.Department;
import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

@Data
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long studentId;

    @NotNull
    @Pattern(regexp = "[A-Z][a-z]*")
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    @Min(18)
    private int age;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Department department;

    public Student(long studentId, String firstName, String lastName, int age, Department department) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.department = department;
    }

    public Student() {
    }
}

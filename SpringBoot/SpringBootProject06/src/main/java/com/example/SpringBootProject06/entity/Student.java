package com.example.SpringBootProject06.entity;


import jakarta.persistence.*;

import javax.naming.Name;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany
    @JoinTable(name = "student_courses",joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns =@JoinColumn(name = "course_id"))
    private Set<Course> courses = new HashSet<>();

}

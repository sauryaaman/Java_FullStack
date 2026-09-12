package com.example.SpingBootJPAP05.service;


import com.example.SpingBootJPAP05.entity.Student;
import com.example.SpingBootJPAP05.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


//    @Autowired    feild injection
    private StudentRepository repository;

    @Autowired   //  COnstructor INjection
    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudentData()
{

    return (List<Student>) repository.findAll();
}

}

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

    return repository.findAll();
}

   public Student saveStudent(Student student)
   {
       return repository.save(student);
   }

   public Student getStudentById( Long id)
   {
       return repository.findById(id)
               .orElseThrow(()-> new RuntimeException("student not found"));
   }


   public void deleteStudent(Long id)
   {
        repository.deleteById(id);

   }
}

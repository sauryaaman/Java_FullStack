package com.example.StudentAPI.controller;

import com.example.StudentAPI.model.Student;
import com.example.StudentAPI.service.CourseService;
import com.example.StudentAPI.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
//    @Autowired     Feild Dependeny Injection
    private StudentService studentService;

    private CourseService courseService;



//    @Autowired   //Constructor Injection
//    public StudentController(StudentService studentService,CourseService courseService) {
//        this.studentService = studentService;
//        this.courseService=courseService;
//    }


  //Mandatory Dependency
@Autowired   //Constructor Injection
public StudentController(StudentService studentService) {
    this.studentService = studentService;

}




    //Setter Injection
//     @Autowired
//    public void setService(StudentService studentService)
//    {
//        this.studentService=studentService;
//    }


    public CourseService getCourseService() {
        return courseService;
    }

    //optional dependency
   @Autowired(required = false)
    public void setCourseService(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/all") //("/students/all")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }

//    @GetMapping("/{id}")
//    public Student getStduentById(@PathVariable int id)
//    {
//        return service.getStudentById(id);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getStudentById(@PathVariable int id)
    {
        Student stduent=studentService.getStudentById(id);
        if(stduent==null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(stduent);
    }



}

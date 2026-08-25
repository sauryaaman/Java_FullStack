package org.example;

public class Student {
    private final int rollnum;
    private final String name;


    private Course course;



    public Student(int rollnum, String name) {
        this.rollnum = rollnum;
        this.name = name;
    }

    public Student(Course course, String name, int rollnum) {
        this.course = course;
        this.name = name;
        this.rollnum = rollnum;

        // contructor Dependency INjection   CI
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void displayDetails(){
        System.out.println("student roll num : "+rollnum);
        System.out.println("Student name :"+ name);
        if (course == null) {
            System.out.println("no course assign");
            return;
        }
        System.out.println("assigned course");
        course.study();

    }

}

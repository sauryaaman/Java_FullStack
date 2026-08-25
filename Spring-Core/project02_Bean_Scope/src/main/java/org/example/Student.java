package org.example;

public class Student {
    private String name;
    public Student()
    {

        System.out.println("Student Constructor or Object created");
    }



    public void setName(String name) {
        this.name = name;
    }

    public void showDetails()
    {
        System.out.println("Student name is :"+ name);
    }
}

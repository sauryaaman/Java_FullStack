package org.example;

public class backendCourse implements Course{
    @Override
    public String getCoursename() {
        return "Backend course";
    }

    @Override
    public void study() {
        System.out.println("Spring boot, sping core");
    }
}

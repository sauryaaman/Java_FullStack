package org.example;

public class MathsCourse implements Course {

    @Override
    public String getCoursename() {
        return "MathsCourse";
    }

    @Override
    public void study() {
        System.out.println("number system,reasioning");
    }
}

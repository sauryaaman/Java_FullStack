package org.example;

import java.lang.reflect.Field;

public class FieldInjectionDemo {

    private FieldInjectionDemo(){

    }

    public static void injectCourse(Student student, Course course){
        try{
           Field declareField= Student.class.getDeclaredField("course");
           declareField.setAccessible(true);
            declareField.set(student,course);

        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }

}

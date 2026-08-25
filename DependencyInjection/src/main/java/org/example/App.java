package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Constructor Injection");

        Course mathsCourse= new MathsCourse();
        Student s1= new Student(mathsCourse,"Aman",32);
        s1.displayDetails();


        //CI
        System.out.println("---------------------------");


        System.out.println("Setter Injection");

        Course backendCourse= new MathsCourse();
        Student s2= new Student(321,"Saurya");

        s2.setCourse(backendCourse);
         s2.displayDetails();
        //Setter Injection
        System.out.println("----------------");


       System.out.println("Field Injection");

       Student s3= new Student(102,"kajal");

       FieldInjectionDemo.injectCourse(s3,new backendCourse());
       s3.displayDetails();









    }
}

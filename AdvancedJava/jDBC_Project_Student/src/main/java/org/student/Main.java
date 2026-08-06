package org.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        StudentServices service= new StudentServices();
        int choice;

        do {
            System.out.println("Student Management System");
            System.out.println("-------------------------");
            System.out.println("Enter  your choice");
            System.out.println("1. Add Student");
            System.out.println("2. View All Student");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. exit");

            System.out.println(" enter  your choice");
            choice= sc.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.println("enter Student Id: ");
                    int id= sc.nextInt();

                    sc.nextLine();

                    System.out.println("enter the Student Name: ");
                    String  name= sc.nextLine();

                    System.out.println("enter the Student email: ");
                    String email = sc.nextLine();

                    System.out.println("enter th Student course");
                    String course= sc.nextLine();

                    System.out.println("enter the  Student marks");
                    double marks= sc.nextDouble();

                    Student student= new Student(id, name, email,course,marks);
                    service.addStudent(student);
                    break;
                case 2:
                    service.viewAllStudent();
                    break;
                case 3:
                    System.out.println("enter the Student ID: ");
                     int newid= sc.nextInt();
                     service.searchStudent(newid);
                     break;

                case 6:
                    System.out.println("Applicationn CLodes");
                    break;
                default:
                    System.out.println("invalid choice");

            }

        }while (choice!=6);
        sc.close();




    }
}
